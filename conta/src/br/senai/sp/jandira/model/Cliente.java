package br.senai.sp.jandira.model;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String telefone;
	private String cep;
	
	//NOME
	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	//Certificado de pessoa fisica 
	public String getCpf () {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//TELEFONE ou CELULAR
	public String getTelefone () {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Código de endereçamento postal
	public String getCep () {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
