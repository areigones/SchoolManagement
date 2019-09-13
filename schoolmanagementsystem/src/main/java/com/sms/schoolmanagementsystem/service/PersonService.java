package com.sms.schoolmanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.schoolmanagementsystem.repository.PersonRepository;
import com.sms.schoolmanagementsystem.entity.Person;
/**
 * 
 * @author JavaAcademy
 * This service uses its respective repository to implement:
 * Save, Create, Find, Edit, Delete, and Delete by Id.
 */
@Service
public class PersonService{
	
	@Autowired
    private PersonRepository personRepository;
	
	public Person createPerson(Person person) {
		
        return personRepository.save(person);
    }
 
    public Optional<Person> getPerson(Long id) {
        return personRepository.findById(id);
    }
 
    public Person editPerson(Person person) {
        return personRepository.save(person);
    }
 
    public void deletePerson(Person person) {
        personRepository.delete(person);
    }
 
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
