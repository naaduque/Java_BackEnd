package POO_Polimorfi;

public class Preguica extends AnimalBase implements Animal {
	
	Preguica(String nome, String idade, String som, String caracteristica)
	{
		super(nome,idade,som,caracteristica);
		nomeClasse = "Preguiça";
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
