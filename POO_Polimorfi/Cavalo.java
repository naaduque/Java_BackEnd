package POO_Polimorfi;

public class Cavalo extends AnimalBase implements Animal {
	
	Cavalo(String nome, String idade, String som, String caracteristica)
	{
		super(nome,idade,som,caracteristica);
		nomeClasse = "Cavalo";
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
