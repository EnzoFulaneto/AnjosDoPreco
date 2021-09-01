package org.generation.anjosDoPreco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name = "tb_categoria")
public class CategoriaModel {
	//--------DECLARANDO OS ATRIBUTOS
		@Id   // IDENTIFICA COMO PRIMART KEY
		@GeneratedValue (strategy = GenerationType.IDENTITY) // SERVE COMO AUTO INCREMENT DO MYSQL
		private long id;
		
		@NotBlank	// SERVE COMO UM NOT NULL (DO MYSQL) MAIS COMPLETO
		private String categoria;
		
	//-------CONSTRUTORES
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
}
