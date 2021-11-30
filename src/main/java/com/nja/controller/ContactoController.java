package com.nja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nja.entity.Contacto;
import com.nja.service.ContactoService;

@RestController
@RequestMapping("/contactenos")
public class ContactoController {
	
	@Autowired
	private ContactoService contactoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Contacto> getContactos(){
		return this.contactoService.getContactos();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public Contacto getContacto(@PathVariable("id") Integer id) {
		return this.contactoService.getContacto(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Contacto addContacto(@RequestBody Contacto contacto) {
		return this.contactoService.addContacto(contacto);
	}

}
