import java.util.Random;


public class Main {

	public static void main(String[] args) {
		//Kal�n �nl�ler: a, �, o, u.
		//�nce �nl�ler: e, i ,�, �
		String[] sesliHarfArrayi={"A", "E", "I", "�", "U", "�", "O", "�"};
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
				System.out.println("Kal�n sesli harf.");
				break;
			default:
				System.out.println("�nce sesli harf.");
		}
	}

}
