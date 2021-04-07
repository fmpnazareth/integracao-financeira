package com.fnazareth.servicos_mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fnazareth.servicos_mobile.entities.Favorecido;
import com.fnazareth.servicos_mobile.service.TransferenciaService;

@RestController
@RequestMapping(value = "/transferencia")
public class TransferenciaController {

	@Autowired
	private TransferenciaService transferenciaService;
	
	@GetMapping(value = "/favorecido/{id}")
	public ResponseEntity<Favorecido> favorecidoById(@PathVariable Long id){
		return ResponseEntity.ok(transferenciaService.getFavorecidoById(id));
		
	}
}
