package POO;

public class Funcion�rio {

	/*Objeto = Algo que pode ser sentido e descrito por suas caracter�sticas;
	 * Classe = cria um objeto;
	 * Atributos/a��es = caracter�sticas da classe;
	 */	
		//atributos da classe:
			private String nomeDoFuncion�rio;
			private String contatoDoFuncion�rio;
			private String cidadeDoFuncion�rio;
			private String cargoDoFuncion�rio;
		 
		//(construtor referencia ao objeto criado na main)
	public Funcion�rio (String nomeDoFuncion�rio,String contatoDoFuncion�rio,
		String cidadeDoFuncion�rio,String cargoDoFuncion�rio) {
		
		  this.nomeDoFuncion�rio = nomeDoFuncion�rio;
		  this.contatoDoFuncion�rio = contatoDoFuncion�rio;
		  this.cidadeDoFuncion�rio = cidadeDoFuncion�rio;
		  this.cargoDoFuncion�rio = cargoDoFuncion�rio;
	}
	//m�todos que manipulam os atributos 
	public void imprimirInfo() {
		System.out.println("\nO funcion�rio: "+nomeDoFuncion�rio+", \npossui o(s) seguinte(s) contato(s): email-"+contatoDoFuncion�rio+", \na cidade natal do funcion�rio �: "+cidadeDoFuncion�rio+", \no cargo do funcion�rio �: "+cargoDoFuncion�rio);
	}
	public String getNomeDoFuncion�rio() {
		return nomeDoFuncion�rio;
	}
	public void setNomeDoFuncion�rio(String nomeDoFuncion�rio) {
		this.nomeDoFuncion�rio = nomeDoFuncion�rio;
	}
	public String getContatoDoFuncion�rio() {
		return contatoDoFuncion�rio;
	}
	public void setContatoDoFuncion�rio(String contatoDoFuncion�rio) {
		this.contatoDoFuncion�rio = contatoDoFuncion�rio;
	}
	public String getCidadeDoFuncion�rio() {
		return cidadeDoFuncion�rio;
	}
	public void setCidadeDoFuncion�rio(String cidadeDoFuncion�rio) {
		this.cidadeDoFuncion�rio = cidadeDoFuncion�rio;
	}
	public String getCargoDoFuncion�rio() {
		return cargoDoFuncion�rio;
	}
	public void setCargoDoFuncion�rio(String cargoDoFuncion�rio) {
		this.cargoDoFuncion�rio = cargoDoFuncion�rio;
	}
}
