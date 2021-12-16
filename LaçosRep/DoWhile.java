package LaçosRep;


import java.util.Scanner;







public class DoWhile {







	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);


		


		int num, somaNum=0;


		


			System.out.println("\nEntre com um número: ");


			num=leia.nextInt();


			


		do


		{


			somaNum+=num;


			System.out.println("Entre com um número: ");


			num=leia.nextInt();


			


			


		}while(num!=0);


		


		System.out.println("A soma dos números informados foi de "+somaNum);


	}


}



