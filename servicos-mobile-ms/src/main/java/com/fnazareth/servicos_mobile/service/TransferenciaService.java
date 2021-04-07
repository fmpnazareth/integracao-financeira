package com.fnazareth.servicos_mobile.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fnazareth.servicos_mobile.entities.Favorecido;

@Service
public class TransferenciaService {
	
	@Value("${favorecidos-ms.host}")
	private String favorecidosHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Favorecido getFavorecidoById(Long id) {

		Map<String,String> uriVariables = new HashMap<String,String>();
		uriVariables.put("id",String.valueOf(id)); 
		
		return restTemplate.getForObject(favorecidosHost.concat("favorecidos-ms/{id}"), Favorecido.class, uriVariables);
		
	}

}
