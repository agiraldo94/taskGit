package operations;

public class Basic {

	public static void main(String[] args) {
		sum(1,4);
		subtract(2, 1);
		division(8,4);
		multiplication(2, 4);
	}
	
	public static void sum(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void subtract(double a, double b) {
		System.out.println(a-b);
	}
	
	public static void division(double a, double b) {
		System.out.println(a/b);
	}
	
	public static void multiplication(double a, double b) {
		System.out.println(a*b);
	}
	

}
