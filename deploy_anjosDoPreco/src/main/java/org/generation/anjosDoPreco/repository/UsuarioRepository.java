package org.generation.anjosDoPreco.repository;

import java.util.Optional;

import org.generation.anjosDoPreco.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional <Usuario> findAllByUsuario (String usuario);
}
