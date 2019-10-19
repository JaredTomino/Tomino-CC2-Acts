public class CC2_Lab3{
  public static void main(String [] args){
	char j = 'J';
	char a = 'A';
	char r = 'R';
	char e = 'S';
	char d = '!';
	
	int l = j;
	int m = a;
	int n = r;
	int o = e;
	int p = d;
	
	
	
	System.out.println("J - " + l);
	System.out.println("A - " + m);
	System.out.println("R - " + n);
	System.out.println("E - " + o);
	System.out.println("D - " + p);
	System.out.println(j+""+a+""+r+""+e+""+d);
	
	
	int sum = l+m+n+o+p;
	int product = l*m*n*o*p;
	int average = (l+m+n+o+p)/5;
	int remainder = product%average;
    System.out.println("Sum: " + sum);
	System.out.println("Product: " + product);
	System.out.println("Average: " + average);
	System.out.println("Remainder: " + remainder);
	
     }
} 