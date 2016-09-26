import java.util.Scanner;

class Actor {
	String name;
	String role;
	String birthdate;
}

public class ActorList {
	public static void main( String[] args ) throws Exception {
		String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
		// Scanner inFile = new Scanner(new java.io.File("s01e01-cast.txt"));
		Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
		int recordCounter = 0;
		while ( inFile.hasNext() ) {
			recordCounter++;
			Actor a = getActor(inFile);
			System.out.print(a.name + " was born on " + a.birthdate);
			System.out.println(" and played " + a.role);
		}
		inFile.close();
		System.out.println("There were " + recordCounter + " records read from the file.");
	}
	
	public static Actor getActor( Scanner input ) {
		Actor a = new Actor();
		a.name = input.nextLine();
		a.role = input.nextLine();
		a.birthdate = input.nextLine();
		
		return a;
	}
}