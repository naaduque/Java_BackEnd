package IntroJava;

import java.util.Scanner;

public class Exerc_2Program {
	public static void main (String args[])
	{ 
		// * 1 year -- 365 days *1 month -- 30 days * 1 day -- 1 day */
		
		Scanner leia = new Scanner(System.in);
		
		int anos,meses,dias,tempo;
		
		System.out.println("Digite quantos anos em dias você tem: ");
		
		tempo = leia.nextInt();
		anos = tempo / 365;
		meses = (tempo - (365 * anos)) / 30;
		dias = (tempo - (365 * anos)) %30;
		
		System.out.println("\nVocê viveu: "+anos+" anos, "+meses+" meses e "+dias+" dias.");
		
	}
}
