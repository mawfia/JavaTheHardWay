import java.util.Scanner;

class Room {
	int roomNumber;
	String roomName;
	String description;
	int numExits;
	String[] exits = new String[10];
	int[] destinations = new int[10];
}

public class TextAdventureFinal {
	public static void main( String[] args ) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		//java.io.File saveGame = new java.io.File("text-adventure-room2-saved.txt");
		
		// initialize rooms from file
		Room[] rooms = loadRoomsFromFile("text-adventure-rooms2.txt");
		
		// showAllRooms(rooms); // for debugging
		
		// Okay, so let's play the game!
		int currentRoom = 0;
		String ans;
		
		if ( (new java.io.File("text-adventure-room2-saved.txt")).exists() ) {
			System.out.print( "A saved game exists. Do you want to load the saved game: (y/n)?");
			if ( (keyboard.nextLine()).equals("y")) {
				System.out.println("Loading...\n");
				//Scanner readSavedGame = new Scanner(new java.io.File("text-adventure-room2-saved.txt")); 
				currentRoom = (new Scanner(new java.io.File("text-adventure-room2-saved.txt"))).nextInt();
			}
			
		}
		System.out.println( "Type \"pause\" at anytime to save and stop game.\n");
		while ( currentRoom >= 0 ) {
			Room cur = rooms[currentRoom];
			System.out.print ( cur.description );
			System.out.print("> ");
			ans = keyboard.nextLine();
			
			// See if what they typed matches any of our exit names
			boolean found = false;
			for ( int i=0; i<cur.numExits; i++ ) {
				if ( cur.exits[i].equals(ans) ){
					// if so, change our next room to that exit's room number
					currentRoom = cur.destinations[i];
					found = true;
				}
				else if ( ans.equals("pause") ){
					java.io.PrintWriter out = new java.io.PrintWriter(new java.io.File("text-adventure-room2-saved.txt"));
					//java.io.PrintWriter out = new java.io.PrintWriter(saveGame);
					out.print( cur.roomNumber );
					out.close();
					found = true;
					System.out.println("Game has been saved...Goodbye.");
					currentRoom = -1;
					break;
				}
			}
			if ( ! found )
				System.out.println("Sorry, I don't understand.");
		}
	}
	
	public static Room[] loadRoomsFromFile( String filename ) {
		Scanner file = null;
		try {
			file = new Scanner(new java.io.File(filename));
		}
		catch ( java.io.IOException e ) {
			System.err.println("Can't open '" + filename + "' for reading.");
			System.exit(1);
		}
		
		int numRooms = file.nextInt();
		Room[] rooms = new Room[numRooms];
		
		// initialize rooms fromfile
		int roomNum = 0;
		while ( file.hasNext() ) {
			Room r = getRoom(file);
			if ( r.roomNumber != roomNum ) {
				System.err.print("Just read room # " + r.roomNumber);
				System.err.println(", but " + roomNum + " was expected.");
				System.exit(2);
			}
			rooms[roomNum] = r;
			roomNum++;
		}
		file.close();
		
		return rooms;
	}
	
	public static void showAllRooms( Room[] rooms ) {
		for ( Room r: rooms ) {
			String exitString = "";
			for ( int i=0; i<r.numExits; i++ )
				exitString += "\t" + r.exits[i] + " (" + r.destinations[i] + ")";
			System.out.println( r.roomNumber + ") " + r.roomName );
			System.out.println( exitString );
		}
	}
	
	public static Room getRoom( Scanner f ) {
		// any rooms left in the file?
		if ( ! f.hasNextInt() )
			return null;
		
		Room r = new Room();
		String line;
		
		// read in the room # for error-checking later
		r.roomNumber = f.nextInt();
		f.nextLine();   // skip "\n" after room #
		
		r.roomName = f.nextLine();
		
		// read in the room's description
		r.description = "";
		while ( true ) {
			line = f.nextLine();
			if ( line.equals("%%") )
				break;
			r.description += line + "\n";
		}
		
		//  finally, we'll read in the exits
		int i = 0;
		while ( true ) {
			line = f.nextLine();
			if ( line.equals("%%") )
				break;
			String[] parts = line.split(":");
			r.exits[i] = parts[0];
			r.destinations[i] = Integer.parseInt(parts[1]);
			i++;
		}
		r.numExits = i;
		
		// should be done; return the Room
		return r;
	}
}