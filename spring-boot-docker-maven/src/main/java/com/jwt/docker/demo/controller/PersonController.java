package com.jwt.docker.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.docker.demo.model.Person;
import com.jwt.docker.demo.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping("/all")
	public List<Person> getAll() {
		return personService.getAll();

	}

	@GetMapping("/id/{id}")
	public Person getPerson(@PathVariable("id") String id) {
		return personService.getPerson(id);
	}

}
