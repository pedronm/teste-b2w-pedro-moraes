package com.br.pmoraes.teste-b2w-stw.repositories;

import com.br.pmoraes.teste-b2w-stw.models.Planets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PlanetsRepository extends MongoRepository<Planets, String> {
	  Planets findBy_id(ObjectId _id);
	}