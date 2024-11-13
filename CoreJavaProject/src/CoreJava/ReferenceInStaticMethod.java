package CoreJava;

public class ReferenceInStaticMethod {

	static ReferenceInStaticMethod obj = new ReferenceInStaticMethod();
	
//	static {
//		System.out.println(ReferenceInStaticMethod.obj);
//		ReferenceInStaticMethod.intit();
//	}
	static {
		System.out.println(ReferenceInStaticMethod.obj);
		ReferenceInStaticMethod.obj = ReferenceInStaticMethod.init();
	}
	public static void main(String[] args) {

		System.out.println(ReferenceInStaticMethod.obj);
	}
	
//	static void intit() {
//		ReferenceInStaticMethod.obj = new ReferenceInStaticMethod();
//	}
	
	static ReferenceInStaticMethod init() {
		return new ReferenceInStaticMethod();
	}

}
