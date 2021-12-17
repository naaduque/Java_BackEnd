package POO_Polimorfi;

public class AnimalBase{

	protected String nome;
	protected String idade;
	protected String som;
	protected String caracteristica;
	protected String nomeClasse;
	
	AnimalBase(String nome, String idade, String som, String caracteristica)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.caracteristica = caracteristica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	
	
}
