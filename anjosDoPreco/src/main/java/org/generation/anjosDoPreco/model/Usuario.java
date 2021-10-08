package org.generation.anjosDoPreco.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_usuario")
public class Usuario {
//------------COLUNAS DA TABELA "USUARIO"
	
	//Atributos da nossa Tabela Usuario 
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	//Nome do Usuario
	@NotNull(message = "O Nome é Obrigatório")
	@Size (min = 2, max= 100)
	private String nome;
	
	//Usuario de acesso a conta 
	@NotNull(message = "O Usuario é Obrigatório")
	@Size (min = 5, max= 100)
	private String usuario;
	
	//Senha da Conta do Úsuario
	@NotNull(message = "A Senha deve ter no mínimo 8 caracteres")
	@Size (min = 5, max= 100)
	private String senha;
	
	//Recebe o Link do Documento
	@NotNull(message = "Documento muito pesado!!")
	@Size (min = 5, max= 9999)
	private String documento; 
	
	//Tipos de Úsuario - Admnistrador - Cliente
	@NotNull(message = "")
	private String tipo;
	
	//Ligando Produto ao Usuario
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Produto> produto;
	
//---------CONSTRUTOR - DADOS REQUISITADOS -------
	public Usuario(Long id, String nome, String usuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
}