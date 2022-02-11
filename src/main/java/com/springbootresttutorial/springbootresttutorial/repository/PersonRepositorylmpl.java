package com.springbootresttutorial.springbootresttutorial.repository;

import org.springframework.stereotype.Service;

import com.springbootresttutorial.springbootresttutorial.dto.PersonDTO;



@Service
public class PersonRepositorylmpl implements PersonRepository {
	
	@Override
	public void persist(final PersonDTO personDTO) {
		// implementation of persisting to database
	}

}
