package com.nja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nja.entity.Contacto;

@Service
public interface ContactoService {
	
	List<Contacto> getContactos();
	Contacto getContacto(Integer id);
	Contacto addContacto(Contacto contacto);
}
