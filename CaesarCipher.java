import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CaesarCipher {
	/**
	  * Returns the character shifted by the given number of lettes.
	  */
	  public static char shiftLetter( char c, int n ) {
		  int u = c;
		  
		  if ( ! Character.isLetter(c) )
			  return c;
		  
		  u = u + n;
		  if ( Character.isUpperCase(c) && u > 'Z'
			|| Character.isLowerCase(c) && u > 'z' ) {
				u -= 26;
		  }
		  if ( Character.isUpperCase(c) && u < 'A'
			|| Character.isLowerCase(c) && u < 'a' ) {
				u += 26;
		  }
		  
		  return (char)u;
	  }
	  
	  public static void main( String[] args ) throws Exception {
		  Scanner keyboard = new Scanner(System.in);
		  String plaintext, cipher = "", cipherFileIn, cipherFileOut;
		  int shift;
		  
		  System.out.print(" Type name of the text file (do not include the file extension): ");
		  cipherFileOut = "encrypted"+(cipherFileIn = keyboard.nextLine()+".txt");
		  System.out.print("Shift (0-26): ");
		  shift = keyboard.nextInt();
		  System.out.println("The encrypted file is named: " + cipherFileOut);
		  /*System.out.print("Message: ");
		  plaintext = keyboard.nextLine();
		  */
		  
		  File f = new File(cipherFileIn);
		  Scanner input = new Scanner(f);
			plaintext = input.nextLine();
			/* The following line is for reading the shift amount from file instead of from the human user
			shift = input.nextInt();*/
		  input.close();
		  
		  for ( int i=0; i<plaintext.length(); i++ ) {
			  cipher += shiftLetter( plaintext.charAt(i), shift );
		  }
		  
		  PrintWriter output = new PrintWriter(cipherFileOut);
			output.println( cipher );
		  output.close();
		  
		  /* The following line is for outputing the the encrypted message to the screen
		  System.out.println( cipher ); */
	  }
}