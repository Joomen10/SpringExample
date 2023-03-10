package com.chjoopark.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chjoopark.spring.ex.lifecycle.model.Person;

@RestController // @Controller + @ResponseBody
@RequestMapping("/lifecycle/ex01")
public class Ex02RestController {

	@RequestMapping("/3")
	public String stringResponse() {
		return "안녕하세요 <br> RestController 입니다.";
	}
	
	// 직접만든 클래스의 객체 리턴
	@RequestMapping("/4")
	public Person objectResponse() {
		Person person = new Person();
		person.setName("박주영");
		person.setAge(23);
		
		return person;
	}
	
	// status code를 포함한 response 
	@RequestMapping("/5")
	public ResponseEntity<Person> entinyResponse() {
		Person person = new Person();
		person.setName("박주영");
		person.setAge(23);
		
		// http status code
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
		
		
	}
	
}
