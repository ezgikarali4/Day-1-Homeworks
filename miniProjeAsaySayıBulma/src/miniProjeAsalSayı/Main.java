package miniProjeAsalSayý;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int rand_int1 = rand.nextInt(100);
		
		while(rand_int1 <=2) {
			rand_int1++;
		}
		
		boolean isPrime = true;
		for (int i=2; i<rand_int1; i++) {
			
			int remainder2 = rand_int1 % i;
			
			if(remainder2 == 0) {
				isPrime = false;
				System.out.println("The remainder of the calculation " + rand_int1 + " % " + i + " is " + remainder2 + ".");
				System.out.println(i + " is a multiplier of " + rand_int1 + ".");
				
			} 
			//else if(isPrime){
				//System.out.println("The remainder of the calculation " + rand_int1 + " % " + i + " is " + remainder2 + " and random number is a PRIME NUMBER.");
			//}
			
		}
		if(isPrime){
			System.out.println(rand_int1 +  " is a PRIME NUMBER.");
		}else {
			System.out.println(rand_int1 + " is NOT a prime number.");
		}
	}

}
