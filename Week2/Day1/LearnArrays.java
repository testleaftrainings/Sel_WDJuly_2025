package week2.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		//             0   1   2  3  4
		int scores[]= {56,100,44,67,87};   //  0-4
		
		//scores[0]=56;  scores[1]=100;  scores[2]=44;
		//scores[3]=67;  scores[4]=87;   scores[5]=
		
		//Find number of elements
		int lengthOfArray = scores.length;
		System.out.println("The Length of array is: "+lengthOfArray);

		//Retrieve a value - using index
		System.out.println(scores[3]);
		
		//Retrieive all the data
		// 0  1   2    3    4
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			//System.out.println(scores[0]);  56
			//System.out.println(scores[1]);  100
			////System.out.println(scores[2]); 44
			//System.out.println(scores[3]);  67
			//System.out.println(scores[4]);  87
			//System.out.println(scores[5]);  //OutOfBound  
		}
		
		//To retrieve the highest and lowest value 
		//highest - 100
		//lowest -44                         // 0   1  2  3   4
		//int scores[]= {56,100,44,67,87};   //{44,56,67,87,100}    //Length=5  Last index=4
		
		//To arrange to ascending - sort
		Arrays.sort(scores);
		//lowest
		System.out.println("Lowest value is: "+scores[0]);
		//Highest
		System.out.println("The highest value is: "+scores[lengthOfArray-1]);
		
		
		//Array Instantiation
		int numbers[]=new int[4];
		numbers[0]=89;
		numbers[1]=94;
		numbers[2]=100;
		numbers[3]=50;
		numbers[4]=60;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
