package Exercicio;

public class Professor extends Pessoa {
	public String titulacaoMax;
	
	
	public Professor(String titulacaoMax, String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		this.titulacaoMax = titulacaoMax;
	}
	//getters e setters
	public String getTitulacaoMax() {
		return titulacaoMax;
	}


	public void setTitulacaoMax(String titulacaoMax) {
		this.titulacaoMax = titulacaoMax;
	}

	//--------------------------------------
	private void cadastrar() {

	}
}
