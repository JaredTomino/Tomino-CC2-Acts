import java.util.*;
public class KamoteSayote{
	//Tomino Jared S.
	public static void main(String args[]) {
		Scanner kamsay = new Scanner(System.in);
		int result1, result2;
			System.out.println("Enter Input: ");
				int N = kamsay.nextInt();
				int M = kamsay.nextInt();
				int K = kamsay.nextInt();
				
				result1 = N/M;
				result2 = (N%M)*K;
		if(N >= 1&&M >= 1&&K >= 1&&N <= 1000&&M <= 1000&&K <= 1000){
			System.out.println(result1 + " kamotes");
			System.out.println(result2 + " sayotes");
		}else{
			System.out.println("Invalid Input.");
			
		}
		
	}
	
	}