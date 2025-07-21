package week3.day1;

public class CalculatorFunction {
	
	//add 2 whole numbers
	public void addNumbers(int a,int b) {
		System.out.println(a+b);
	}
	
	//add 2 decimal numbers
	public void addNumbers(float a, float b) {
		System.out.println(a+b);
	}
	
	// add 3 whole numbers
	public void addNumbers(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		CalculatorFunction calcOptions=new CalculatorFunction();
		
		calcOptions.addNumbers(1.5f, 2.5f);
		
	}
	
}
