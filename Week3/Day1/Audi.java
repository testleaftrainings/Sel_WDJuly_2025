package week3.day1;

public class Audi extends Car {

	public void fastBraking() {
		System.out.println("Fast Braking");

	}

	public static void main(String[] args) {
		Audi audiOptions = new Audi();
		audiOptions.fastBraking();
		audiOptions.applyBrake();
		audiOptions.makeHorn();
	}

}

//Audi    extends Car extends Vehicle
//GrandChild               GrandParent