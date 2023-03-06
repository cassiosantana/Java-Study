package com.example.demo.model;

import java.util.Date;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

public class Cliente {

	private String nome;
	private String email;
	private String senha;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataDeNascimento;
	
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nome, String email, String senha, Date dataDeNascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataDeNascimento = dataDeNascimento;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}
	
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nome, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha);
	}
	
	@Override
	public String toString() {
		return nome + ", " + email;
	}
	
}
