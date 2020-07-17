import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Pass a double val!");
		System.exit(0);
		}
		
		double num = (double) Double.parseDouble(args[0]);
		int whole = DecimalSplitter.getWhole(num); 
		double fraction = DecimalSplitter.getFraction(num);
		
		System.out.println("Whole : " + DecimalSplitter.getWhole(whole));
		System.out.printf("Fraction : %.3f\n" , DecimalSplitter.getFraction(fraction));

		System.out.println("The number is " + (DecimalSplitter.isOdd(whole) ? "Odd" : "Even"));
	}
}
