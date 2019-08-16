package Exercicio;

public class Aluno extends Pessoa{
    public String matricula;
    public String situacao;
    
    		
    public Aluno (String matricula, String situacao, String nome, String endereco, String telefone) {
    	super(nome, endereco, telefone);
    	this.matricula = matricula;
    	this.situacao = situacao;
    }
    		
    		
	// getters e setters
    public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	//-------------------------------
    private void matricular() {
        
    }
    private void trancar() {
        
    }
    private void formar() {
        
    }
    private void evadir() {
        
    }
    private void obterAvalicoes() {
        
    }
    private void emitirHitorico() {
        
    }
}
