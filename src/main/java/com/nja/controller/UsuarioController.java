package com.nja.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nja.entity.Usuario;
import com.nja.service.UsuarioService;
import com.nja.util.UsuarioUtil;

import com.nja.filter.RequestFilter;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

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
	private UsuarioUtil login(@RequestBody Usuario usuario) {
		Usuario u = this.usuarioService.login(usuario);
		if(u == null) {
			return new UsuarioUtil();
		} else {
			UsuarioUtil usuarioUtil = new UsuarioUtil();
			usuarioUtil.setId(u.getId());
			usuarioUtil.setUsuario(u.getUsuario());
			usuarioUtil.setCorreo(u.getCorreo());
			
			
			long tiempo = System.currentTimeMillis();
			String token = Jwts.builder()
					           .signWith(SignatureAlgorithm.HS256, RequestFilter.KEY)
					           .setSubject(u.getUsuario())
					           .setIssuedAt(new Date(tiempo))
					           .setExpiration(new Date(tiempo + 900000))
					           .claim("username", u.getUsuario())
					           .claim("correo", u.getCorreo())
					           .claim("id", u.getId())
					           .compact();
					           
		
			usuarioUtil.setToken(token);
			return usuarioUtil;
		} 
	}

}
