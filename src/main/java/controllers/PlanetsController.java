package com.br.pmoraes.teste-b2w-stw.controllers;

import com.br.pmoraes.teste-b2w-stw.models.Planets;
import com.br.pmoraes.teste-b2w-stw.repositories.PlanetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(“/planets”)
public class PlanetsController {
  @Autowired
  private PlanetsRepository repository;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Planets> getAllPlanets(){
	  return repository.findAll();
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Planets getPlanetById(@PathVariable("id") ObjectId id) {
	  return repository.findBy_id(id);
  }
  
  @RequestMapping(value ="/{id}", method = RequestMethod.PUT)
  public void modifyPlanetById(@PathVariable("id") Object id, @Valid)
  @RequestBody Planets planets){
	  planets.set_id(id);
	  repository.save(planets);
	  
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deletePet(@PathVariable ObjectId id) {
	  repository.delete(repository.findBy_id(id));
  }
  
}