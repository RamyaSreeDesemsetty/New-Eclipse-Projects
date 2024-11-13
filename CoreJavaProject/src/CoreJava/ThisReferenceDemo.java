package CoreJava;

public class ThisReferenceDemo {
	int x=10;
public ThisReferenceDemo() {
System.out.println(this);
System.out.println(this.x);
}
	public static void main(String[] args) {
new ThisReferenceDemo();
new ThisReferenceDemo();
	}

}
