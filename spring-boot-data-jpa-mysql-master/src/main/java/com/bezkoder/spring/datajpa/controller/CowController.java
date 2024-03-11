package com.bezkoder.spring.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.datajpa.model.CowEntity;
import com.bezkoder.spring.datajpa.repository.Cowrepository;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CowController {

	@Autowired
	Cowrepository cowrepository;

	

	@PostMapping("/insert")
	public ResponseEntity<CowEntity> createTutorial(@RequestBody CowEntity entityRq) {
		try {
			CowEntity entity = cowrepository.save(entityRq);
					//.save(new CowEntity(tutorial.getTitle(), tutorial.getDescription(), false));
			return new ResponseEntity<>(entity, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	

}
