package week3.day2;

public class Sbi implements Rbi {

	public void mandatoryKYC() {
		System.out.println("Aadhar card");
		
	}

	public void depositAmount() {
		System.out.println("10 Lakhs");
		
	}
	public static void main(String[] args) {
		Sbi sbiOptions=new Sbi();
		sbiOptions.mandatoryKYC();
		sbiOptions.depositAmount();
	}

}
