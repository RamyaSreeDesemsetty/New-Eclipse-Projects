package oopspolymorphism;

public class ComplieTimePolymorphism {

	void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	void add(float a,float b) {
		float result = a+b;
		System.out.println(result);
	}
	void add(int a,int b, int c) {
		int result = a+b+c;
		System.out.println(result);
	}
	public static void main(String[] args) {
		
ComplieTimePolymorphism cp = new ComplieTimePolymorphism();
cp.add(2, 3);
cp.add(2.4f, 3.4f);
cp.add(3, 9,2);

	}

}
