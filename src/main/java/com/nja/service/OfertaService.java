package com.nja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nja.entity.Oferta;

@Service
public interface OfertaService {

	List<Oferta> getOfertas();
	Oferta getOferta(Integer id);
	Oferta addOferta(Oferta oferta);
	Oferta editOferta(Oferta oferta);
}
