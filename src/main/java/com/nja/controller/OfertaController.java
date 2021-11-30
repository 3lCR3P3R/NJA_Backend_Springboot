package com.nja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nja.entity.Oferta;
import com.nja.service.OfertaService;

@RestController
@RequestMapping("/ofertas")
public class OfertaController {
	
	 @Autowired
	 private OfertaService ofertaService;
	 
	 @RequestMapping(method = RequestMethod.GET)
	 List<Oferta> getOfertas(){
		 return this.ofertaService.getOfertas();
	 }
	 
	 @RequestMapping(method = RequestMethod.GET, value = "/{id}")
	 Oferta getOferta(@PathVariable("id") Integer id) {
		 return this.ofertaService.getOferta(id);
	 }
	 
	 @RequestMapping(method = RequestMethod.POST)
	 Oferta addOferta(@RequestBody Oferta oferta) {
		 return this.ofertaService.addOferta(oferta);
	 }
	 
	 @RequestMapping(method = RequestMethod.PUT)
	 Oferta editOferta(@RequestBody Oferta oferta) {
		 return this.ofertaService.editOferta(oferta);
	 }

}
