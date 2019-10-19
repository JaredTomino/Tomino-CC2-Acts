public class VariablesAndDataTypes{
  public static void main(String [] args){
    String a = "The temperature in Baguio City has warmed throughout the years.";
    char b = 'A';
	float c = 16;
	double d = 23.5;
	
	byte hours= 24;
	short days= 7;
	long weeks= 4;
	int years = 12;
	boolean l = true;
	if(l ==true){
	System.out.println(a + '\n' +
    "          " +b + " recent news article stated that the City has been averaging "+ c +" degrees celsius at dawn and "+ d +" at noon." + '\n' +
    "			       Regardless, lowlanders still fell cold "+ hours +" hours a day, " + days + " days a week," + weeks + " weeks per month and " + years +" months each year.");
    }
	else{
	System.out.println("The Boolean was changed to flase value.");
	}

	}
} 