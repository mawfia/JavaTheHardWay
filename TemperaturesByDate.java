import java.util.Scanner;

class TemperatureSample {
	int month, day, year;
	double temperature;
}

public class TemperaturesByDate {
	public static void main( String[] args ) throws Exception {
		/*String site = "https://learnjavathehardway.org";
		String path = "/txt/avg-daily-temps-with-dates-atx.txt";
		Scanner inFile = new Scanner((new java.net.URL(site+path)).openStream());*/
		Scanner inFile = new Scanner(new java.io.File("MDWASHDC.txt"));
		
		TemperatureSample[] tempDB = new TemperatureSample[10000];
		int numRecords, i = 0;
		
		while (inFile.hasNextInt() && i < tempDB.length ) {
			TemperatureSample e = new TemperatureSample();
			e.month = inFile.nextInt();
			e.day = inFile.nextInt();
			e.year = inFile.nextInt();
			e.temperature = inFile.nextDouble();
			if ( e.temperature == -99 )
				continue;
			tempDB[i] = e;
			i++;
		}
		inFile.close();
		numRecords = i;
		
		System.out.println(numRecords + " daily temperature loaded.");
		
		double total = 0, avg, highTempFeb = 0;
		int count = 0;
		/*for ( i=0; i<numRecords; i++ ) {
			if( tempDB[i].month == 11 ){
				total += tempDB[i].temperature;
				count++;
			}
		}*/
		for ( i=0; i<numRecords; i++ ) {
			if ( tempDB[i].month == 2 && tempDB[i].temperature > highTempFeb ) {
				highTempFeb = tempDB[i].temperature;
				count = i;
			}
		}
		
		/*avg = total / count;
		avg = roundToOneDecimal(avg);
		System.out.print("Average daily temperature over " + count);
		System.out.println(" days in November: " + avg);*/
		System.out.print("The highest temperature in February was "+ highTempFeb);
		System.out.println(" on " + tempDB[count].day + " February " + tempDB[count].year + ".");
		
		TemperatureSample ts = tempDB[500];
		System.out.println( ts );
	}
	
	public static double roundToOneDecimal( double d ) {
		return Math.round(d*10)/10.0;
	}
}