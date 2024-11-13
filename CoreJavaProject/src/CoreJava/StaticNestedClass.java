package CoreJava;

public class StaticNestedClass {//outerclass
static int st = 10;
int nst = 11;
static class NestedClass{ // nestedclass
	void display() {
System.out.println("calling staic variable -> " + st); 
//System.out.println("calling non-staic variable -> " + nst);gives compilation error
	}
}
	public static void main(String[] args) {
		
StaticNestedClass.NestedClass nestclassInstance = new StaticNestedClass.NestedClass();
nestclassInstance.display();

	}

}
