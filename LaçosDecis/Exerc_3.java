package LaçosDecis;

import java.util.Scanner;

public class Exerc_3 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14 ) {
			System.out.printf("A sua categoria é Infantil");
		}else if(idade >= 15 && idade <= 17 ) {
			System.out.printf("A sua categoria é Juvenil");
		}else if(idade >= 18 && idade <= 25 ) {
			System.out.printf("A sua categoria é Adulto");
		} else {
			System.out.printf("Não se encaixa nas categorias requisitadas.");
		}
	}

}

