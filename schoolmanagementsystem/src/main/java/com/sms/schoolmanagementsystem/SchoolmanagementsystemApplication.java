package com.sms.schoolmanagementsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.schoolmanagementsystem.entity.Person;
import com.sms.schoolmanagementsystem.service.PersonService;

@SpringBootApplication
public class SchoolmanagementsystemApplication {


	public static void main(String[] args) {
		SpringApplication.run(SchoolmanagementsystemApplication.class, args);
	}

}
