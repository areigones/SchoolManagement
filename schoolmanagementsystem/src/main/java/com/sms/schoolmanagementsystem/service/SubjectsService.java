package com.sms.schoolmanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.schoolmanagementsystem.repository.SubjectsRepository;
import com.sms.schoolmanagementsystem.entity.Subjects;
/**
 * 
 * @author JavaAcademy
 * This service uses its respective repository to implement:
 * Save, Create, Find, Edit, Delete, and Delete by Id.
 */
@Service
public class SubjectsService{
	
	@Autowired
    private SubjectsRepository subjectsRepository;
	
	public Subjects createSclass(Subjects subjects) {
		
        return subjectsRepository.save(subjects);
    }
 
    public Optional<Subjects> getSubjects(Long id) {
        return subjectsRepository.findById(id);
    }
 
    public Subjects editSclass(Subjects subjects) {
        return subjectsRepository.save(subjects);
    }
 
    public void deleteSubjects(Subjects subjects) {
    	subjectsRepository.delete(subjects);
    }
 
    public void deleteSubjects(Long id) {
    	subjectsRepository.deleteById(id);
    }
}