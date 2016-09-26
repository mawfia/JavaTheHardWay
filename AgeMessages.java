import java.util.Scanner;

public class AgeMessages {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		
		System.out.print( "How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println( "You are: " );
		if ( age < 13 ) {
			System.out.println( "\ttoo young to create a Facebok account" );
		}
		if ( age < 16 ) {
			System.out.println( "\ttoo young to get a driver's license" );
		} 
		else System.out.println( "\tOld enough to create a Facebook account" );
		
		if ( age < 18 ) {
			System.out.println( "\ttoo young to get a tattoo" );
		}
		else System.out.println("\tOld enough to get a driver's license" );
		
		if ( age < 21 ) {
			System.out.println( "\ttoo young to drink alcohol" );
		}
		else System.out.println( "\tOld enough to get a tattoo" );
		
		if ( age < 35 ) {
			System.out.println( "\ttoo young to run for President of the U.S." );
			System.out.println( "\t\t(How sad!)" );
		}
		else System.out.println( "\tOld enough to drink alcohol" );
		
		if ( age >= 65 ) {
			System.out.println( "\tYou are old enough to retire!" );
		}
		else System.out.println( "\tOld enough to run for President of the U.S." );
	}
}
/* Question 1. If you type in an age greater than or equal to 35, only "You are: " gets printed because 
   there are no operations set to execute for an age entered less than 35. */