package POO_Polimorfi;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro animal1 = new Cachorro("Cooper","1","latir","correr");
		Cavalo animal2 = new Cavalo("Spirit","5","relinchar","correr");
		Preguica animal3 = new Preguica("Sleepy","10","n�o sabemos","dormir em �rvores");
		
		System.out.println("\nColetando dados dos animais...");
		System.out.println("\nO animal �: "+animal1.getNomeClasse()+"\nO nome �: "+animal1.getNome()+"\nCom a idade de: "+animal1.getIdade()+" anos\nO som que o animal emite �: "+animal1.getSom()+"\nE sua caracter�stica �: "+animal1.getCaracteristica());
		System.out.println("\nO animal �: "+animal2.getNomeClasse()+"\nO nome �: "+animal2.getNome()+"\nCom a idade de: "+animal2.getIdade()+" anos\nO som que o animal emite �: "+animal2.getSom()+"\nE sua caracter�stica �: "+animal2.getCaracteristica());
		System.out.println("\nO animal �: "+animal3.getNomeClasse()+"\nO nome �: "+animal3.getNome()+"\nCom a idade de: "+animal3.getIdade()+" anos\nO som que o animal emite �: "+animal3.getSom()+"\nE sua caracter�stica �: "+animal3.getCaracteristica());
		System.out.println("\nFim do programa. Todos os dados foram exibidos.");
	}

}
