package com.boot.controllers;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.models.Person;
import com.boot.service.PersonService;


@Controller
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping("/person")
	public ResponseEntity<Void> m1(){
		System.out.println("in person");
	/*	Iterable<Person> s =personService.findAll();
		Iterator<Person> itr =s.iterator();*/
	
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
