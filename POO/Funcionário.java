package POO;

public class Funcionário {

	/*Objeto = Algo que pode ser sentido e descrito por suas características;
	 * Classe = cria um objeto;
	 * Atributos/ações = características da classe;
	 */	
		//atributos da classe:
			private String nomeDoFuncionário;
			private String contatoDoFuncionário;
			private String cidadeDoFuncionário;
			private String cargoDoFuncionário;
		 
		//(construtor referencia ao objeto criado na main)
	public Funcionário (String nomeDoFuncionário,String contatoDoFuncionário,
		String cidadeDoFuncionário,String cargoDoFuncionário) {
		
		  this.nomeDoFuncionário = nomeDoFuncionário;
		  this.contatoDoFuncionário = contatoDoFuncionário;
		  this.cidadeDoFuncionário = cidadeDoFuncionário;
		  this.cargoDoFuncionário = cargoDoFuncionário;
	}
	//métodos que manipulam os atributos 
	public void imprimirInfo() {
		System.out.println("\nO funcionário: "+nomeDoFuncionário+", \npossui o(s) seguinte(s) contato(s): email-"+contatoDoFuncionário+", \na cidade natal do funcionário é: "+cidadeDoFuncionário+", \no cargo do funcionário é: "+cargoDoFuncionário);
	}
	public String getNomeDoFuncionário() {
		return nomeDoFuncionário;
	}
	public void setNomeDoFuncionário(String nomeDoFuncionário) {
		this.nomeDoFuncionário = nomeDoFuncionário;
	}
	public String getContatoDoFuncionário() {
		return contatoDoFuncionário;
	}
	public void setContatoDoFuncionário(String contatoDoFuncionário) {
		this.contatoDoFuncionário = contatoDoFuncionário;
	}
	public String getCidadeDoFuncionário() {
		return cidadeDoFuncionário;
	}
	public void setCidadeDoFuncionário(String cidadeDoFuncionário) {
		this.cidadeDoFuncionário = cidadeDoFuncionário;
	}
	public String getCargoDoFuncionário() {
		return cargoDoFuncionário;
	}
	public void setCargoDoFuncionário(String cargoDoFuncionário) {
		this.cargoDoFuncionário = cargoDoFuncionário;
	}
}
