package com.sms.schoolmanagementsystem.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.schoolmanagementsystem.entity.Subjects;

@Repository
@Transactional
public interface SubjectsRepository extends JpaRepository<Subjects, Long> {
	
}