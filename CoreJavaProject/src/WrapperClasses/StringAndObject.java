package WrapperClasses;

public class StringAndObject {

	public static void main(String[] args) {
		long x = 100;
		Long l =Long.valueOf(x);//primitive to object
		String s =l.toString();//object to string
		Long ls = Long.valueOf(s);// string to object

	}

}
