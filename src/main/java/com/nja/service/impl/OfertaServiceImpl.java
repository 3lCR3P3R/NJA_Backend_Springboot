package com.nja.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nja.entity.Oferta;
import com.nja.repository.OfertaRepository;
import com.nja.service.OfertaService;

@Service
public class OfertaServiceImpl implements OfertaService {

	@Autowired
	private OfertaRepository ofertaRepository;
	
	@Override
	public List<Oferta> getOfertas() {
		return this.ofertaRepository.findAll();
	}

	@Override
	public Oferta getOferta(Integer id) {
		Optional<Oferta> oferta = this.ofertaRepository.findById(id);
		
		if(oferta.isPresent()) {
			return oferta.get();
		} else {
			return new Oferta();
		}
	}

	@Override
	public Oferta addOferta(Oferta oferta) {
		return this.ofertaRepository.save(oferta);
	}

	@Override
	public Oferta editOferta(Oferta oferta) {
		return this.ofertaRepository.save(oferta);
	}

}
