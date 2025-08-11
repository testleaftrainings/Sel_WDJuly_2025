package week6.day1;

public class LearnConstructor {
	
	//Declare the employee details
	
	int empID;
	String empName;
	
	//Default Constructor
	public LearnConstructor() {
		System.out.println("I am default constrctor");
	}
	
	//Parameterized Constructor
	
	public LearnConstructor(int empID, String empName) {
		this();
		this.empID=empID;
		this.empName=empName;
	
		System.out.println("I am paramterized constructor");
		System.out.println(empID);
		System.out.println(empName);
	}
	

	public static void main(String[] args) {
		//LearnConstructor lc=new LearnConstructor();
		
		LearnConstructor lc1=new LearnConstructor(21, "Vineeth");
		System.out.println(lc1.empID);
		System.out.println(lc1.empName);
		

	}

}
