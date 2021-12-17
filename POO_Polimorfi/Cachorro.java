package POO_Polimorfi;

public class Cachorro extends AnimalBase implements Animal {
	
	Cachorro(String nome, String idade, String som, String caracteristica)
	{
		super(nome,idade,som,caracteristica);
		nomeClasse = "Cachorro";
	}
	
	@Override
	public String getNome(){
		return nome;
	}
	public String getIdade() {
		return idade;
	}
	public String getSom() {
		return som;
	}
	public String getCaracteristica() {
		return caracteristica;
	}

}
