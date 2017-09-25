package staticInnnerExamples;

public class OuterDemo {

	static void test1() {
		System.out.println("Inside test1() method");
	}
	
	static class Inner {

		static void test2() {
			System.out.println("Inside test2() method");
		}
		
		void test3() {
			System.out.println("Inside test3() method");
		}
		
	}
	
	public static void main(String[] args) {

		OuterDemo.test1();
		OuterDemo.Inner.test2();
		
		OuterDemo.Inner inner = new OuterDemo.Inner();
		inner.test3();
		
	}

}
