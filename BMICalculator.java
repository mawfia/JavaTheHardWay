import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;
		
		System.out.print( "Your height (feet only): " );
		m = keyboard.nextDouble() * 12; // Convert input to inches
		System.out.print( "Your height (inches): ");
		m = ((m + keyboard.nextDouble()) * 2.54) / 100; // Add previously converted amount with input, then convert to meters
		
		System.out.print( "Your weight in pounds: " );
		kg = keyboard.nextDouble() / 2.205;
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}