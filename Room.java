import java.io.*;
import java.text.DecimalFormat;
public class Room{
	//Tomino Jared S.
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));
			
		
		
		
		System.out.println("Enter length: ");
			String inputString = br.readLine();
			double length = Double.parseDouble(inputString);
		System.out.println("Enter width: ");
			String inputtring = ar.readLine();
			double width = Double.parseDouble(inputtring);
			double su = length * width;
			
			String pattern = "########.00";
			DecimalFormat decimalFormat = new DecimalFormat(pattern);

			String number = decimalFormat.format(su);

		System.out.println("The floor space of the room is "+ number +" square units.");

		
		
		}
	
	}