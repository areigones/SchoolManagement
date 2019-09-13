//package com.sms.schoolmanagementsystem.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.sms.schoolmanagementsystem.entity.Login;
//import com.sms.schoolmanagementsystem.entity.Person;
//import com.sms.schoolmanagementsystem.repository.LoginRepository;
//
//@Service
//public class LoginService {
//	
//	@Autowired
//	LoginRepository loginRepository;
//	
//	public Login createLogin(Login login) {
//		System.out.println("Cheguei aqui?");
//		Person person = new Person("name","myresponsible");
//		person.setLogin(login);
//		System.out.println(person);
//		login.setPerson(person);
//		return loginRepository.saveAndFlush(login);
//	}
//
//}
