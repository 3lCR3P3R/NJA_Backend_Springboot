package com.nja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nja.entity.Usuario;
import com.nja.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/registrar", method = RequestMethod.POST)
	private Usuario addUsuario(@RequestBody Usuario usuario) {
		return this.usuarioService.registrar(usuario);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	private Usuario login(@RequestBody Usuario usuario) {
		Usuario u = this.usuarioService.login(usuario);
		if(u == null) {
			return usuario;
		} else {
			return u;
		} 
	}

}
