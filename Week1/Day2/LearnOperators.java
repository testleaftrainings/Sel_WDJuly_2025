package week1.day2;

public class LearnOperators {

	// Java Operator - symbol
	// Assignment
	// Arithmetic
	// Comparison
	// Logical
	// Increment and Decrement

	public static void main(String[] args) {
		// Assignment
		int a = 5;

		// Arithmetic operator
		int b = 3;
		int c = 2;

		// add(+)
		System.out.println(b + c);

		// sub(-)
		System.out.println(b - c);

		// mul(*)
		System.out.println(b * c);

		int d = 7;
		int e = 2;

		// div
		// To get quotient(/)
		System.out.println(d / e);

		// To get the remainder (%)
		System.out.println(d % e);

		System.out.println("---------------------");

		// Comparison
		// If condition satisfied - true
		// If condition not satisfied -false
		// equalTo
		// notEqualTo
		// lessThan
		// greaterThan
		// lessThanOrEqualTo
		// greaterThanOrEqualTO

		int i = 7;
		int j = 8;

		// equalTo (==)
		System.out.println(i == j);// 7==8

		// notEqualTo
		System.out.println(i != j); // 7 not equal to 8
		// i=7, j=8

		// lessThan (<)
		System.out.println(i < j); // 7<8

		// greaterThan(>)
		System.out.println(i > j); // 7>8

		System.out.println("------------------");

		// lessThanOrEqualTo (<=)
		int p = 5;
		int q = 7;
		System.out.println(p <= q);

		// greaterThanOrEqualTO
		System.out.println(p >= q);

		System.out.println("----------------");

		int x = 5;
		int y = 5;

		// Logical operator - 2 Conditions

		System.out.println(x > y && x == y); // 5>7 5==7

		// Or
		System.out.println(x > y || x == y); // 5>7 5==7

		System.out.println("-----------------------");

		// Increment and Decrement operator

		int v = 7;
		// postIncrement (v++)
		System.out.println(v++); // 7
		System.out.println(v); // 8

		// preIncrement (++v)
		System.out.println(++v);
		System.out.println(v); // 9

		// postDecrement (v--)

		System.out.println(v--); // 9

		System.out.println(v); // 8

		// preDecrement (--v)
		System.out.println(--v);

	}

}
