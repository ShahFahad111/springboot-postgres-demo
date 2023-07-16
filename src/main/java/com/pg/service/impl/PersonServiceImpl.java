package com.pg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pg.entity.Person;
import com.pg.repo.PersonRepo;
import com.pg.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepo personRepo;

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return personRepo.findAll();
	}

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		Person save = personRepo.save(person);
		return save;
	}

	@Override
	public Optional<Person> getPersonById(Integer id) {
		Optional<Person> findById = personRepo.findById(id);
		return findById;
	}

	
}
