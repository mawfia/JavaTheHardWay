import java.util.Scanner;

public class ItemNotFound {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		
		String[] heroes = {
			"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
			"Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
			"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
			"Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus", "Jason",
			"Abderus", "Castor", "Ajax", "Hector"
		};
		String guess;
		boolean found;
		
		System.out.println( "Pop Quiz!" );
		System.out.print( "Name any *mortal* hero from Greek mythology: " );
		guess = keyboard.next();
		
		found = false;
		for ( String hero : heroes ) {
			if ( guess.equals(hero) ) {
				System.out.println( "That's one of them!" );
				found = true;
			}
		}
		int counter = 0;
		for ( int n = 0; n <= heroes.length-1 ; n++)
			if ( guess.equals(heroes[n]) ) counter++;
		if ( counter > 0 ) System.out.println( guess + " Was found " + counter + " times." );
		
		if ( found == false ){
			System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
		}
	}
	
}