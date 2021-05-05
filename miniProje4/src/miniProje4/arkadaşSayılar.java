package miniProje4;
import java.util.Random;

public class arkadaşSayılar {

	public static void main(String[] args) {
		/*Friendly numbers are two or more natural numbers with a common abundancy index, 
		the ratio between the sum of divisors of a number and the number itself.*/
		
		
		/*
		int rand_int1 = 4;
		int rand_int2 = 6;
		4 and 6 are exemples, you can enter whatever you like.
		*/
		//If you want to enter a number, replace the bottom part with the top and remove "import java.util.Random" part:
		Random rand = new Random();
        int rand_int1 = rand.nextInt(100);
        int rand_int2 = rand.nextInt(100);
        
        
        System.out.println(rand_int1 + " and " + rand_int2 + " are our numbers.");
        
        int total1 = 0;
        int total2 = 0;
        
        for (int i=1; i<rand_int1; i++) {
            
            int remainder1 = rand_int1 % i;
            int remainder2 = rand_int2 % i;
            
            if(remainder1 == 0) {
            	String result1 = rand_int1 + " /" + i + " = " + remainder1;
            	System.out.println(result1);
            	total1 = total1 + i;
            	System.out.println(total1);
            }
            
            if(remainder2 == 0) {
            	String result2 = rand_int2 + " /" + i + " = " + remainder2;
            	System.out.println(result2);
            	total2 = total2 + i;
            	System.out.println(total2);
            }
        }
        
        if(total1 == total2) {
        	System.out.println(rand_int1 + " and " + rand_int2 + " are FRIENDLY NUMBERS.");
        }else {
        	System.out.println(rand_int1 + " and " + rand_int2 + " are NOT friendly numbers.");
        }
		
		
	}

}
