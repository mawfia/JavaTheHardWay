import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
	public static void main( String[] args ) throws Exception {
		PrintWriter fileout = new PrintWriter("receipt.txt");
		Scanner keyboard = new Scanner(System.in);
		double g, p = 2.60;
		
		System.out.println( "Gas costs $" + p + " per gallon." );
		System.out.print( "How many gallons do you want? " );
		System.out.println("Total cost: $ " + ((g = keyboard.nextDouble())*p) );
		System.out.print( "Writing customized receipt to \'receipt.txt\'" );
		fileout.println( "+------------------------+" );
		fileout.println( "|                        " );
		fileout.println( "|      CORNER STORE      " );
		fileout.println( "|                        " );
		fileout.println( "| 2014-06-25  04:38PM    " );
		System.out.print( "... " );
		fileout.println( "|                        " );
		fileout.println( "| Gallons:      " + g + "     " );
		fileout.println( "| Price/gallon: $" + p + "     " );
		fileout.println( "|                        " );
		fileout.println( "| Fuel total:   $" + g*p + "    " );
		fileout.println( "|                        " );
		fileout.println( "+------------------------+" );
		fileout.close();
		System.out.println( "done." );
	}
}