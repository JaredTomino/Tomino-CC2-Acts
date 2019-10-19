import java.util.Scanner;
//Tomino Jared S.
public class CC2_Lab4 {

    public static void main(String[] args) {
     
		String name = "";
		int age = 0;
		
		System.out.println("Enter your name: ");
			Scanner names = new Scanner(System.in);
				name = names.next();
		System.out.println("Enter your age: ");
			Scanner ages = new Scanner(System.in);
				age = ages.nextInt();
				
		if(name.equals("Jhim")||name.equals("Ethan")){
			if(age > 4 && age < 11){
				System.out.println("Hamster,Dog");	
		}else if(age > 10 && age < 16){
			System.out.println("Spider,Dog");
		}else if(age > 15 && age < 19){
			System.out.println("Dog,Snake");
		}else if(age == 21){
			System.out.println("No Pets, Not Interested");
			}
		}
		else if(name.equals("Sally")||name.equals("Joy")){
			if(age > 4 && age < 11){
				System.out.println("Hamster,Cat");	
		}else if(age > 10 && age < 16){
			System.out.println("Cat,Rabbit");
		}else if(age > 15 && age < 21){
			System.out.println("Cat");
		}else if(age > 20){
			System.out.println("No Pets, Not Interested");
			} 	
		
		
		}
		else{
			System.out.println("Invalid name");
				}		
	}   
}
