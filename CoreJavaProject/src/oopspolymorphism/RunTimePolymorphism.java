package oopspolymorphism;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		MacBook mc = new MacBookPro();
		MacBook mc1 = new MacBookAir();
		mc.start();
		mc.shutdown();
		mc1.start();
		mc1.shutdown();

	}

}
