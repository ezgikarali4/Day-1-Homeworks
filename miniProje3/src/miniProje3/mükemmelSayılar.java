package miniProje3;
import java.util.Random;

public class mükemmelSayýlar {

	public static void main(String[] args) {
		// Perfect number, a positive integer that is equal to the sum of its proper divisors.
		
		/*
		int rand_int = 4;
		4 is an exemple, you can enter whatever you like
		*/
		//If you want to enter a number, replace the bottom part with the top and remove "import java.util.Random" part:
		Random rand = new Random();
        int rand_int = rand.nextInt(100);
        
        
        
        System.out.println("Our number is " + rand_int + ".");
        
        int total = 0;
        
        for (int i=1; i<rand_int; i++) {
            
            int remainder = rand_int % i;
            
            if(remainder == 0) {
            	String result = rand_int + " /" + i + " =" + remainder;
            	
            	System.out.println(result);
 
            	total = total + i;
            	System.out.println(total);
            }
        }
        
        if(total == rand_int) {
        	System.out.println(rand_int + " is a perfect number.");
        }else {
        	System.out.println(total + " is the sum, that's why " + rand_int + " is NOT a perfect number.");
        }
	}
}
