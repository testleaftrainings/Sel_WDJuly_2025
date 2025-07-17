package week2.day4;

public class FibbonacciSeries {
	
	//Write a java program to print fibbonacci series for 8 Numbers
	
			//What is fibbonacci series
			//   0    1    1     2    3    5
			//   a    b  c=a+b
			//What are the requirements
			//What is input?  2 Numbers
			//What is ouput?  A Number series
			
			//Variables - 2 for input, 1 for output
	
	
	//    0         1       1
	//    fn       sn       tn
	//             fn       sn
     public static void main(String[] args) {
		
		int firstNumber=0;
		int secondNumber=1;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		int thirdNumber;
		// 1-8
		for (int i = 1; i <=8; i++) {
			thirdNumber=firstNumber+secondNumber;  //tn=2+3=5   fn=2; sn=3
			firstNumber=secondNumber;              // fn=3
			secondNumber=thirdNumber;              // sn=5
			System.out.println(thirdNumber);       //   1    2    3    5
		}

	}

}
