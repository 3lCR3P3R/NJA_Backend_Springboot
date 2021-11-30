package com.nja.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nja.entity.Contacto;
import com.nja.repository.ContactoRepository;
import com.nja.service.ContactoService;

@Service
public class ContactoServiceImpl implements ContactoService {

	@Autowired
	private ContactoRepository contactoRepository;
	
	@Override
	public List<Contacto> getContactos() {
		return this.contactoRepository.findAll();
	}

	@Override
	public Contacto getContacto(Integer id) {
		Optional<Contacto> contacto = this.contactoRepository.findById(id);
		
		if(contacto.isPresent()) {
			return contacto.get();
		} else {
			return new Contacto();
		}
	}

	@Override
	public Contacto addContacto(Contacto contacto) {
		return this.contactoRepository.save(contacto);
	}

}
