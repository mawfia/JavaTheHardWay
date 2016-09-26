import java.util.Scanner;

public class RudeQuestions {
	public static void main( String [] args ) {
		String name, country;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So your're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print( "Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, ");
		System.out.println( name + "." );
		
		System.out.print(name + ", What country do you currently live in? ");
		country = keyboard.next();
		System.out.println(country + ", sounds like a nice place to live.");
		
		// Question 1. No because a floating point variable can hold whole number values, just not the other way around.
		// Question 2. Yes, because size of the vaule is 8 bits in comparison to an integar or double which would be 32 or 64.
		/* Question 3. keyboard.nextInt() and keyboard.nextDouble() are expecting 8 bit and 32 bit values and when a character
		   or string is input it sees the address of a pointer for the location of the first element of the character array
		   which will be a 64-bit value and incompatible with the whole number value it is expecting*/
	}
}