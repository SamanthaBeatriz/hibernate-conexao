package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class alunos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_aluno;
	
	@Column
	private String nome;
	
	@Column
	private String endereco;
	
	int GetIdAluno(){
		return this.id_aluno;
	}
	String GetEndereco(){
		return this.endereco;
	}
	String GetNome(){
		return this.nome;
	}
	
	public void setIDaluno(int cont) {
		this.id_aluno = cont;
	}
	public void setEndereco(String cont) {
		this.endereco = cont;
	}
	public void setNome(String cont) {
		this.nome = cont;
	}

}
