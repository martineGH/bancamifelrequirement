package com.bmr.bancamifelrequirement.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Configuration
@RestController
public class PokemonApiController {

  @GetMapping("/api/personal/pokemon")
  @CrossOrigin(origins = "*")
  public Object getApi() {
    RestTemplate restTemplate = new RestTemplate();
      ResponseEntity<Object> response = restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon/ditto", Object.class);
      return response.getBody();
      
  }

}
