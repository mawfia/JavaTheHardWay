public class CreatingVariables {
	public static void main ( String[] args ) {
		int x, y, age, total;
		double seconds, e, checking, sum;
		String firstName, lastName, title, problem, answer;
		
		x = 10;
		y = 400;
		age = 39;
		total = 35;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		sum = 3.14;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		problem = "problem";
		answer = "answer";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "The four additional variables are: " + total + ", " + sum + ", " + problem + ", and " + answer + ".");
	}
}