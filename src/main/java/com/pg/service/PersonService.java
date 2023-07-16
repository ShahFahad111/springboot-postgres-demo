package com.pg.service;

import java.util.List;
import java.util.Optional;

import com.pg.entity.Person;

public interface PersonService {

	List<Person> getAllPerson();
	
	Person createPerson(Person person);
	
	Optional<Person> getPersonById(Integer id);
}
