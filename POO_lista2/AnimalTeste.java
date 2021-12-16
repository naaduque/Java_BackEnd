package POO_lista2;


public class AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro Cachorro = new Cachorro ("\nCooper", "1 ano","au au",true);
		
		Cavalo Cavalo = new Cavalo ("\nSpirit", "5 anos","ihii",true);
		
		Preguica Preguica = new Preguica ("\nSleepy", "10 anos","zzz",true);
		
		Cachorro.imprimirInfo();
		Cachorro.imprimirmovimento();
		
		Cavalo.imprimirInfo();
		Cavalo.imprimirmovimento();
		
		Preguica.imprimirInfo();
		Preguica.imprimirmovimento();
		
		
		
	}

}

