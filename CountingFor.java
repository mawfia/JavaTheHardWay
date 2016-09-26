import java.util.Scanner;

public class CountingFor {
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		int n;
		String message;
		
		System.out.println( "Enter a message and I'll display it five times." );
		System.out.print( "Message: " );
		message = keyboard.nextLine();
		
		for ( n = 1 ; n <= 5 ; n++ ) {
			System.out.println( n + ". " + message );
		}
		
		System.out.println( "\nNow I'll show it ten times and count by 5s." );
		for ( ; n <= 50 ; n += 5 ) {
			System.out.println( n + ". " + message );
		}
		
		System.out.println( "\nFinally, three times counting backward." );
		for ( n = 3 ; n > 0 ; n -= 1 ) {
			System.out.println( n + ". " + message );
		}
	}
}
// Study drill:  Since integer variable n is a global variable it retains the last value of 6 from the first for
// loop and starts at 6 in the second for loop.