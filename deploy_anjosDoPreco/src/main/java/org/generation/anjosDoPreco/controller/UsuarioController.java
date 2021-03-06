package org.generation.anjosDoPreco.controller;

import java.util.List;
import java.util.Optional;

import org.generation.anjosDoPreco.model.UserLogin;
import org.generation.anjosDoPreco.model.Usuario;
import org.generation.anjosDoPreco.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/usuarios")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping ("/logar")
	public ResponseEntity <UserLogin> Authentication (@RequestBody Optional <UserLogin> user) {
		return usuarioService.Logar(user)
				.map(resp -> ResponseEntity.ok (resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping ("/cadastrar")
	public ResponseEntity <Usuario> post(@RequestBody Usuario usuario) {
		return usuarioService.CadastrarUsuario(usuario)
				.map (resp -> ResponseEntity.status (HttpStatus.CREATED).body(resp))
				.orElse (ResponseEntity.status(HttpStatus.CONFLICT).build());
	}
	
    @GetMapping("/all")
    public ResponseEntity <List<Usuario>> getAll(){
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }
}
