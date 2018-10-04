package com.br.pmoraes.testeB2wStw.repositories;

import com.br.pmoraes.testeB2wStw.models.Planets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PlanetsRepository extends MongoRepository<Planets, String> {
	  Planets findBy_id(ObjectId _id);
	}