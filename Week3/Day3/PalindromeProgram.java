package week3.day3;

public class PalindromeProgram {
	
	//What is Palindrome?
	//   12121
	
	//12121%10 =1    //12121/10 =1212
	//1212%10  =2   //1212/10   =121
	//121%10   =1   //121/10    =12
	//12%10    =2   //12/10     =1
	//1%10     =1   //1/10      =0
	
	
	//What are the input and output?
	//input=number
	//output=number
	
	//Variables
	// 1 for input, 1 for output, 1 for remainder

	public static void main(String[] args) {
		
		int input=12121;
		int temp=input;
		int output=0;
		int remainder;
	
		//while(input>0)     //12121        >0
		for(input=input;input>0;input=input/10){
			remainder=input%10;            //12121%10 =1        1212%10=2       121%10=1       12%10=2           1%10=1                         
			output=(output*10)+remainder;  //(0*10)+1 =0+1=1    (1*10)+2=12     (12*10)+1=121  (121*10)+2=1212   (1212*10)+1=12121
			input=input/10;                //12121/10=1212      1212/10 =121     121/10=12     12/10=1            1/10=0
			
		}
		
		//output=12121  //input=0
		
		if (output==temp) {
			System.out.println("This is a palindrome number");
		}
		
		else {
			System.out.println("Not a palindrome");
		}
	}

}
