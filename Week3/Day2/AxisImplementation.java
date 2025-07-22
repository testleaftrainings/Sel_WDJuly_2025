package week3.day2;

public class AxisImplementation extends Axis {

	public void mandatoryKYC() {
		System.out.println("Driving license");

	}

	public void depositAmount() {
		System.out.println("15 lakhs");

	}

	public void houseLoan() {
		System.out.println("House loan");

	}

	public void goldLoan() {
		super.goldLoan();
		System.out.println("Gold loan upto 5 lakhs");

	}

	public static void main(String[] args) {
		AxisImplementation axisOptions = new AxisImplementation();
		axisOptions.mandatoryKYC();
		axisOptions.depositAmount();
		axisOptions.houseLoan();
		axisOptions.goldLoan();

	}

}

//AxisImplementation extends Axis implements Rbi