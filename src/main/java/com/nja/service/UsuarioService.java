package com.nja.service;

import org.springframework.stereotype.Service;

import com.nja.entity.Usuario;

@Service
public interface UsuarioService {
	
	Usuario registrar(Usuario usuario);
	
	Usuario login(Usuario usuario);

}
