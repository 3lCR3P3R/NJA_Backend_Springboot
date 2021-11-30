package com.nja.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nja.entity.Usuario;
import com.nja.repository.UsuarioRepository;
import com.nja.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario registrar(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}

	@Override
	public Usuario login(Usuario usuario) {
		return this.usuarioRepository.getByUsuarioAndPassword(usuario.getUsuario(), usuario.getPassword());
	}
}
