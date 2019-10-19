import java.lang.Math.*; 
//Tomino Jared S.
public class CC2_Lab5 {

    public static void main(String[] args) {
		
		double messageCount = Math.random() * 1000;	
		int typecast = (int)messageCount;
		double charges = 0;
		System.out.println("You have sent " + typecast + "messages.");
			if(typecast > 200){
				charges=(typecast-200) * 0.5;
				System.out.println("You have incurred "+ charges + " PHP in charges.");
			}
			
	}
    }
    

