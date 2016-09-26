import java.net.URL;
import java.util.Scanner;

public class LowestTemperature {
	public static void main ( String[] args ) throws Exception {
		String urlbase = "https://learnjavathehardway.org/txt/";
		double[] temps = arrayFromUrl(urlbase + "avg-daily-temps-atx.txt");
		
		System.out.println( temps.length + " temperature in database.");
		
		double lowest = 9999.99, highest = 0.00;
		
		for ( int i=0 ; i<temps.length; i++ ) {
			if ( temps[i] < lowest ) {
				lowest = temps[i];
			}
			else if ( temps[i] > highest ) {
				highest = temps[i];
			}
		}
		
		System.out.print( "The lowest average daily temperature was " );
		System.out.println( lowest + "F (" + fToC(lowest) + "C)" );
		System.out.print( "The highest average daily temperature was " );
		System.out.println( highest + "F (" + fToC(highest) + "C)" );
	}
	
	public static double[] arrayFromUrl( String url ) throws Exception {
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();
		
		double[] dubs = new double[count];
		
		for ( int i=0 ; i<dubs.length ; i++ )
			dubs[i] = fin.nextDouble();
		fin.close();
		
		return dubs;
	}
	
	public static double fToC( double f ) {
		return (f-32)*5/9;
	}
}