package com.boot.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.boot.models.Person;

@Service
public interface PersonService extends CrudRepository<Person, Integer>  {

	
}
