public class ArrayIntro {
	public static void main( String[] args ) {
		String[] planets = { "Mercury", "Venus", "Earth", "Mars",
							 "Jupiter", "Saturn", "Uranus", "Neptue" };
		String[] cars = { "Ford", "Cheverolet", "GMC", "Honda", "Toyota", "Buick",
						  "Tesla", "Ferrari", "Mercury", "Jeep", "Audi", "Mercedes" };
							 
		for ( String p : planets ) {
			System.out.println( p + "\t" + p.toUpperCase() );
		}
		System.out.println();
		for ( String c : cars ) {
			System.out.println ( c );
		}
	}
}