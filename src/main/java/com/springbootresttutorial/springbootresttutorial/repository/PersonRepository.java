package com.springbootresttutorial.springbootresttutorial.repository;

import com.springbootresttutorial.springbootresttutorial.dto.PersonDTO;

public interface PersonRepository {


	void persist(PersonDTO personDTO);
}
