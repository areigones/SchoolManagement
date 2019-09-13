package com.sms.schoolmanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.schoolmanagementsystem.repository.TimetableRepository;
import com.sms.schoolmanagementsystem.entity.Timetable;
/**
 * 
 * @author JavaAcademy
 * This service uses its respective repository to implement:
 * Save, Create, Find, Edit, Delete, and Delete by Id.
 */
@Service
public class TimetableService{
	
	@Autowired
    private TimetableRepository timetableRepository;
	
	public Timetable createTimetables(Timetable timetable) {
		
        return timetableRepository.save(timetable);
    }
 
    public Optional<Timetable> getTimetables(Long id) {
        return timetableRepository.findById(id);
    }
 
    public Timetable editTimetables(Timetable timetable) {
        return timetableRepository.save(timetable);
    }
 
    public void deleteTimetables(Timetable timetable) {
    	timetableRepository.delete(timetable);
    }
 
    public void deleteTimetables(Long id) {
    	timetableRepository.deleteById(id);
    }
}