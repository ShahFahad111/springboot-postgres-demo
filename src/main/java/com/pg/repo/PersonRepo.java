package com.pg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pg.entity.Person;
import com.pg.entity.PersonPK;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
