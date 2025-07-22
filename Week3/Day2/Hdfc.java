package week3.day2;

public class Hdfc implements Rbi {

	public void mandatoryKYC() {
		System.out.println("Pan is mandatory");

	}

	public void depositAmount() {
		System.out.println("5 lakhss");

	}

	public static void main(String[] args) {
		Hdfc hdfcOptions = new Hdfc();
		hdfcOptions.mandatoryKYC();
		hdfcOptions.depositAmount();
	}

}
