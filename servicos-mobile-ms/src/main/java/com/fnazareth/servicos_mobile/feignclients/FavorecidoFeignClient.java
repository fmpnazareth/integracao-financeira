package com.fnazareth.servicos_mobile.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.fnazareth.servicos_mobile.entities.Favorecido;



@Component
@FeignClient(name = "favorecidos-ms", url="localhost:8001", path="/favorecidos-ms")
public interface FavorecidoFeignClient {
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Favorecido> findById(@PathVariable Long id);

}
