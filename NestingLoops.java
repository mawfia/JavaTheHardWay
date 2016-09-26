public class NestingLoops {
	public static void main( String[] args ){
		// this is #1 - I'll call it "CN"
		for ( int n=1; n <= 3; n++ ) {
			 for ( char c='A'; c <= 'E'; c++ ) {
				System.out.println( c + " " + n );
			}
		}
		
		System.out.println("\n");
	
		// this is #2 - I'll call it "AB"
		for ( int a=1; a<= 3; a++ ) {
			for ( int b=1; b<= 3; b++ ) {
				System.out.print( "(" + a + "," + b + ") " );
			}
			// * You will add a line of code here.
			System.out.println();
		}
		
		System.out.println("\n");
	}
}
// Study Drills 1.  The variable (1-3) controlled by the inner loops changes faster.
// Study Drills 2.  The variable (A-E) now controlled by the inner loop changes faster.
// Study Drills 3.  Each for loop iteration is output on a different line.
// Study Drills 4.  Instead of a new line output each iteration of the inner for loop a new line is input after each
//					iteration of the outer for loop.