package com.sms.schoolmanagementsystem.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.schoolmanagementsystem.entity.Sclass;

@Repository
@Transactional
public interface SclassRepository extends JpaRepository<Sclass, Long> {
	
}