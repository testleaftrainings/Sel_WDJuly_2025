package week3.day1;
          // Child        Parent
public class Car extends Vehicle {

	public void applyBrake() {
		System.out.println("Brake");

	}
	
	public static void main(String[] args) {
		Car carOptions=new Car();
		carOptions.applyBrake();
		carOptions.makeHorn();
	}
	
	
}
