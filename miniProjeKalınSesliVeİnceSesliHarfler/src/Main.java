import java.util.Random;


public class Main {

	public static void main(String[] args) {
		//Kalýn Ünlüler: a, ý, o, u.
		//Ýnce Ünlüler: e, i ,ö, ü
		String[] sesliHarfArrayi={"A", "E", "I", "Ý", "U", "Ü", "O", "Ö"};
      	Random r=new Random();        
      	int randomNumber=r.nextInt(sesliHarfArrayi.length);
      	char[] harf = sesliHarfArrayi[randomNumber].toCharArray();
      	System.out.println(harf);
		
      	
      	String str = new String(harf);
      	
      	switch(str) {
			case "A" :
			case "I" :
			case "O" :
			case "U" :
				System.out.println("Kalýn sesli harf.");
				break;
			default:
				System.out.println("Ýnce sesli harf.");
		}
	}

}
