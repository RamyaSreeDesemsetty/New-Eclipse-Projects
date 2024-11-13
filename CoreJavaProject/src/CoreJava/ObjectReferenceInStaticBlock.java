package CoreJava;

public class ObjectReferenceInStaticBlock {

	static {
		ObjectReferenceInStaticBlock ors = new ObjectReferenceInStaticBlock();
		System.out.println(ors);
	}
	public static void main(String[] args) {

	}

}
