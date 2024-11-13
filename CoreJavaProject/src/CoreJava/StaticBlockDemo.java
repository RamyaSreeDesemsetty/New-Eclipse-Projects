package CoreJava;

public class StaticBlockDemo {

	public static void main(String[] args) {
System.out.println("Hello world");
	}
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}

}
