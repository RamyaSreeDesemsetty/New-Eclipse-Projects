package WrapperClasses;

public class WrapperTypeConstructor {

	public static void main(String[] args) {
		long l = 20;
		Long  a = l;//converts primitive to object automatically
		
String s ="20";
//Long c = new Long(s); this is deprecated from java 9
Long b =Long.valueOf(s);
	}

}
