package Exercicio;

public class Disciplina {
	public int codigo;
	public int cargaHoraria;
	public String descricao;
	public String ementa;
	public String bibliografia;

	public Disciplina(int codigo, int cargaHoraria, String descricao, String ementa, String bibliografia) {
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
		this.ementa = ementa;
		this.bibliografia = bibliografia;
	}
	// getters e setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	
	//------------------------------------------------------------
	private void cadastrar() {

	}
}
