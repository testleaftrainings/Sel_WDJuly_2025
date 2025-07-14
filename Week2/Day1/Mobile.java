package week2.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("make call");
	}

	public void takePhoto() {
		System.out.println("take photo");

	}

	public static void main(String[] args) {
		// ClassName objectName=new ClassName();

		Mobile mobileOptions = new Mobile();
		mobileOptions.makeCall();
		mobileOptions.takePhoto();
	}
}
