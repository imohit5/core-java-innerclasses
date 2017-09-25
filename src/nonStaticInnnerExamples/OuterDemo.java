package nonStaticInnnerExamples;

public class OuterDemo {

	private static int x = 50;
	private int y;

	public OuterDemo(int y) {
		this.y = y;
	}

	void test1() {
		System.out.println("Inside test1() method");
	}

	class Inner {
		
		private int y;
		
		public Inner(int y) {
			this.y = y;
		}

		void test2() {
			System.out.println("Inside test2() method");
			System.out.println("OuterDemo x "+OuterDemo.x);
			System.out.println("OuterDemo y "+OuterDemo.this.y);
			System.out.println("Inner y "+this.y);
		}

	}

	public static void main(String[] args) {

		OuterDemo inner1 = new OuterDemo(60);
		inner1.test1();

		OuterDemo.Inner inner2 = inner1.new Inner(30);
		inner2.test2();
		System.out.println("Inner y "+inner2.y);
	}

}
