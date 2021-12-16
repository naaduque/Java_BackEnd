package POO;

public class Paciente {

	 	
		//Attributes class:
			private String nomeDoPaciente;
			private String contatoDoPaciente;
			private String cidadeDoPaciente;
			private String convenioDoPaciente;
			private String sintomasDoPaciente;
		 
		
	public Paciente (String nomeDoPaciente,String contatoDoPaciente,
		String cidadeDoPaciente,String convenioDoPaciente,String sintomasDoPaciente) {
		
		  this.nomeDoPaciente = nomeDoPaciente;
		  this.contatoDoPaciente = contatoDoPaciente;
		  this.cidadeDoPaciente = cidadeDoPaciente;
		  this.convenioDoPaciente = convenioDoPaciente;
		  this.sintomasDoPaciente = sintomasDoPaciente;
	}
	
	public void imprimirInfo() {
		System.out.println("\nO paciente: "+nomeDoPaciente+", \npossui o(s) seguinte(s) contato(s): email-"+contatoDoPaciente+", \na cidade natal do paciente é: "+cidadeDoPaciente+", \no convênio médico do paciente é: "+convenioDoPaciente+", \nos sintomas do paciente são: "+sintomasDoPaciente);
	}
	public String getNomeDoPaciente() {
		return nomeDoPaciente;
	}
	public void setNomeDoPaciente(String nomeDoPaciente) {
		this.nomeDoPaciente = nomeDoPaciente;
	}
	public String getContatoDoPaciente() {
		return contatoDoPaciente;
	}
	public void setContatoDoPaciente(String contatoDoPaciente) {
		this.contatoDoPaciente = contatoDoPaciente;
	}
	public String getCidadeDoPaciente() {
		return cidadeDoPaciente;
	}
	public void setCidadeDoPaciente(String cidadeDoPaciente) {
		this.cidadeDoPaciente = cidadeDoPaciente;
	}
	public String getConvenioDoPaciente() {
		return convenioDoPaciente;
	}
	public void setConvenioDoPaciente(String convenioDoPaciente) {
		this.convenioDoPaciente = convenioDoPaciente;
		
	}	
	public String getSintomasDoPaciente() {
		return sintomasDoPaciente;
	}
	public void setSintomasDoPaciente(String sintomasDoPaciente) {
	    this.sintomasDoPaciente = sintomasDoPaciente;
	}
}
