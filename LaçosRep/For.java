package LaçosRep;

import java.util.Scanner;



public class For {



	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x, num,numPar=0,numImpar=0;
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		for (x=0;x<=10;x++) {
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			if (x%2==0) {
				numPar+=1;
			
			}else {
				numImpar+=1;
			
			}
		}
		System.out.println("\nO total de números pares é"+numPar);
		System.out.println("\nO total de números impares é: "+numImpar);



	}



}







