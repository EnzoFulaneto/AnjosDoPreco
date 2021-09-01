package org.generation.anjosDoPreco.repository;

import java.util.List;

import org.generation.anjosDoPreco.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
	public List<CategoriaModel> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
