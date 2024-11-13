package CoreJava;

public class StaticReferenceDemo {
static StaticReferenceDemo obj;
	static {
		System.out.println(obj);
		obj = new StaticReferenceDemo();
	}
	public static void main(String[] args) {
		System.out.println(StaticReferenceDemo.obj);
	}

}
