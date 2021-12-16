package POO_lista2;


public class Preguica extends Animal{
	
	private boolean correr;

	public Preguica(String nomeAnimal,String idade,String somqueFaz,boolean correr)
	{
		super(nomeAnimal,idade,somqueFaz);
		this.correr = correr;
		
	}
	public boolean isCorrer() {
		return correr;
	}
	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	public void imprimirInfo()
	{
		System.out.println("\nInsira os dados da preguica. '\nNome: "+getNomeAnimal()+"\nidade dele: " +getIdade()+ "\nsom emitido: "+getSomqueFaz());
	}
	public void imprimirmovimento()
	{
		if (isCorrer()==true)
		
		{
			System.out.println("Ela não gosta de correr...");
		}
	}


}
