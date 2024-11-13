package CoreJava;

public class StaticMethodDemo {

	public static void main(String[] args) {
		System.out.println("main");
StaticMethodDemo.method1();
	}
	//static method
	static void method1() {
		System.out.println("static method1");
	}
static {
	System.out.println("Inside static block");
	StaticMethodDemo.method1();
}

}
