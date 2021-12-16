package LaçosDecis;


	import java.util.Scanner;

	 public class Exerc_2 {
	 public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		 
		 int n1,n2,n3;
		 
		 System.out.print("Digite o primeiro número: ");
		 n1 = leia.nextInt();
		 System.out.print("Digite o segundo número: ");
		 n2 = leia.nextInt();
		 System.out.print("Digite o terceiro número: ");
		 n3 = leia.nextInt();
		 
		 if(n1 <= n2 && n2 <= n3) {
			 System.out.printf("Ordem crescente dos números: "+n1+", "+n2+","+n3);
		 }else if(n1 <= n3 && n3 <= n2){
			 System.out.printf("Ordem crescente dos números: "+n1+", "+n3+","+n2);
		 }else if(n2 <= n1 && n1 <= n3){
			 System.out.printf("Ordem crescente dos números: "+n2+", "+n1+","+n3);
		 }else if(n2 <= n3 && n2 <= n1){
			 System.out.printf("Ordem crescente dos números: "+n2+", "+n3+","+n1);
		 }else if(n3 <= n1 && n1 <= n2){
			 System.out.printf("Ordem crescente dos números: "+n3+", "+n1+","+n2);
		 }else {
			 System.out.printf("Ordem crescente dos números: "+n3+", "+n2+","+n1);
		 }
	 }
	}

