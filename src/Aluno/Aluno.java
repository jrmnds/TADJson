package Aluno;

public class Aluno {
	
	private String ra;
	private String cpf;
	private String nome;
	private int idade;
	
	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
	
}
