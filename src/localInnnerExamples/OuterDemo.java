package localInnnerExamples;

public class OuterDemo {

	void test1() {
		System.out.println("Inside test1() method");

		class Inner {

			void test2() {
				System.out.println("Inside test2() method");
			}

		}

		Inner inner = new Inner();
		inner.test2();

	}

	public static void main(String[] args) {

		OuterDemo inner1 = new OuterDemo();
		inner1.test1();

	}

}
