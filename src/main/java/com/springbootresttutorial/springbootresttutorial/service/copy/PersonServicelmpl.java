package com.springbootresttutorial.springbootresttutorial.service.copy;

import org.springframework.stereotype.Service;

import com.springbootresttutorial.springbootresttutorial.dto.PersonDTO;



@Service
public class PersonServicelmpl implements PersonService{


	  @Override
	  public boolean isValid(PersonDTO personDTO) {
	    return personDTO != null
	        && personDTO.getProfession() != null
	        && personDTO.getProfession().equals("Software Developer");
	  }
	  
}
