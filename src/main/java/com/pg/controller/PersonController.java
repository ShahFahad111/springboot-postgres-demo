package com.pg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pg.entity.Person;
import com.pg.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/")
	public ResponseEntity<List<Person>> getAllPerson(){
		List<Person> list = personService.getAllPerson();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}

	@PostMapping("/create")
	public ResponseEntity<Person> createPerson(@RequestBody Person person){
		Person createPerson = personService.createPerson(person);
		return new ResponseEntity<>(createPerson, HttpStatus.CREATED);
	}
	
	@GetMapping("/{pid}")
	public ResponseEntity<Optional<Person>> getPerson(@PathVariable("pid") Integer id) throws Exception{
		Optional<Person> personById = personService.getPersonById(id);
		if(personById.isEmpty())
			throw new Exception("Person Not Found");
		return ResponseEntity.ok(personById);
	}
}
