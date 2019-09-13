package com.sms.schoolmanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.schoolmanagementsystem.repository.SclassRepository;
import com.sms.schoolmanagementsystem.entity.Sclass;
/**
 * 
 * @author JavaAcademy
 * This service uses its respective repository to implement:
 * Save, Create, Find, Edit, Delete, and Delete by Id.
 */
@Service
public class SclassService{
	
	@Autowired
    private SclassRepository sclassRepository;
	
	public Sclass createSclass(Sclass sclass) {
		
        return sclassRepository.save(sclass);
    }
 
    public Optional<Sclass> getSclass(Long id) {
        return sclassRepository.findById(id);
    }
 
    public Sclass editSclass(Sclass sclass) {
        return sclassRepository.save(sclass);
    }
 
    public void deleteSclass(Sclass sclass) {
        sclassRepository.delete(sclass);
    }
 
    public void deleteSclass(Long id) {
        sclassRepository.deleteById(id);
    }
}
