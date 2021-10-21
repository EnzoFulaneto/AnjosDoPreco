package org.generation.anjosDoPreco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_Usuario")
public class Usuario {
//------------COLUNAS DA TABELA "USUARIO"
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank
	@Size (max= 100)
	private String nome;
	
	@NotBlank
	@Size (max= 100)
	private String usuario;
	
	@NotBlank
	@Size (max= 100)
	private String senha;
	
	private String tipo;

	//-----------GETTERS AND SETTERS
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}