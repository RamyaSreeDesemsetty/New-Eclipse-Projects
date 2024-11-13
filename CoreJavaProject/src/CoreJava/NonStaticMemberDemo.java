package CoreJava;

public class NonStaticMemberDemo {

	public NonStaticMemberDemo() {
		System.out.println("Inside the constructor");
	}
	{
		System.out.println("Inside the NonStatic block");
	}
	public static void main(String[] args) {
System.out.println("Inside the main method");
new NonStaticMemberDemo();
	}

}
