import java.util.Scanner;

public class ForgetfulMachine {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "What city is the capital of France?" );
		keyboard.next();
		
		System.out.println( "What is 6 multiplied by 7?" );
		keyboard.nextInt();
		
		System.out.println( "Enter a number between 0.0 and 1.0." );
		keyboard.nextDouble();
		
		System.out.println( "Is there anything else you would like to say?" );
		keyboard.next();
	}
}

// The second question blows up when I type in .1 because nextInt is only meant to store whole number values.
/* The third question blows up when I type a character or characters because strings are pointers pointing to an 
   address of the first element of the character array and the keyboard.nextDouble(); sees a 64-bit address instead
   of an integer*/
   
// I would also like to note that I have only been able to get this program to run past line 7 in cmd.exe and not PowerShell ISE
