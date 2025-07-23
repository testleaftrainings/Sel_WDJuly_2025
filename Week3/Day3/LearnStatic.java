package week3.day3;

public class LearnStatic {
	
	public int number=10;
	
	public static int age=30;
	
	public void method1() {
		System.out.println("Non static method");
	}
	
	public static void method2() {
		System.out.println("Static method");
	}
	

	public static void main(String[] args) {
		System.out.println(age);
		
		LearnStatic staticOptions=new LearnStatic();
		System.out.println(staticOptions.number);
		
		staticOptions.method1();
		method2();

	}

}
