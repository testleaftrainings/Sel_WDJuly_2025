package week6.day4;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int number=7;
		
		try {
			System.out.println(number/0);
			
		}
		catch(ArithmeticException exp) {
			System.out.println("The exception is: "+exp);
		}
		
		try {
			int arr[]= new int[-3];    // 0    1    2
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The exception is: "+e);
		}
		
	finally	{
	System.out.println("Reports generated");
	System.out.println("Close the browser");
	}
	
	}

}
