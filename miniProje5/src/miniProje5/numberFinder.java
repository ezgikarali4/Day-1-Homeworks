package miniProje5;
import java.util.Random;

public class numberFinder {

	public static void main(String[] args) {
		int[] numbersArray = new int[] {1,2,10,6,8,32,50,13,18,30,22,7};
		
		/*
		int rand_number = 4;
		4 is an example, you can enter whatever you like.
		*/
		//If you want to enter a number, replace the bottom part with the top and remove "import java.util.Random" part:
		Random rand = new Random();
        int rand_number = rand.nextInt(100);
        
        
        
        boolean includesOrNot = false;
        for(int number : numbersArray) {
        	if(number == rand_number) {
        		includesOrNot = true;
        		break;
        	}
        }
        if(includesOrNot) {
        	System.out.println("Array includes " + rand_number + ".");
        }else {
    		System.out.println("Array doesn't include " + rand_number + ".");
        }
	}

}
