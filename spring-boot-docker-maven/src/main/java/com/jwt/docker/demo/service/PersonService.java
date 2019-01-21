package com.jwt.docker.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.docker.demo.model.Person;

@Service
public class PersonService {

	List<Person> persons = new ArrayList<>();

	public PersonService() {
		Person person = new Person();
		person.setId("101");
		person.setFirstName("Mukesh");
		person.setAge(32);
		person.setLastName("Kumar");
		persons.add(person);
		person = new Person();
		person.setId("102");
		person.setFirstName("Amit");
		person.setLastName("Raj");
		person.setAge(28);
		persons.add(person);

	}

	public List<Person> getAll() {
		return persons;
	}

	public Person getPerson(String id) {
		for (Person person : persons) {
			if (person.getId().equalsIgnoreCase(id)) {
				return person;
			}
		}
		return null;
	}

}
