package com.sms.schoolmanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.schoolmanagementsystem.entity.Mark;
import com.sms.schoolmanagementsystem.repository.MarkRepository;

/**
 * 
 * @author JavaAcademy
 * This service uses its respective repository to implement:
 * Save, Create, Find, Edit, Delete, and Delete by Id.
 */
@Service
public class MarkService {
	
	@Autowired
    private MarkRepository markRepository;
	
	public Mark createMark(Mark mark) {
		
        return markRepository.save(mark);
    }
 
    public Optional<Mark> getMark(Long id) {
        return markRepository.findById(id);
    }
 
    public Mark editMark(Mark mark) {
        return markRepository.save(mark);
    }
 
    public void deleteMark(Mark mark) {
        markRepository.delete(mark);
    }
 
    public void deleteMark(Long id) {
        markRepository.deleteById(id);
    }
}
