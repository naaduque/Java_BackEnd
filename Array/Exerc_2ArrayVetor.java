package Array;

import java.util.Scanner;

public class Exerc_2ArrayVetor {

	public static void main(String[] args) {
		int x,somaPar=0, somaImpar=0, QntImpar=0;
		int[] numero = new int[6];
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nEntre com os valores do vetor: ");
			numero[x] = leia.nextInt();
			
			if(numero[x]%2==0)
			{
				somaPar+=numero[x];
		
			}
			else
			{
				somaImpar+=numero[x];
				QntImpar++;
			}
		}
		
		for (x=0;x<6;x++) {
			if (numero[x] %2==0) {
			System.out.println("Os numeros pares são " +numero[x]);
		}
			else
			{
				System.out.println("Os numero impares são "+numero[x]);
			}
		}
		
		
		System.out.println("\nA soma dos números Pares é: "+somaPar);
		System.out.println("\n A soma dos números Impares é "+somaImpar);
		System.out.println("\nA quantidade de números Impares é "+QntImpar);
		

	}

}
