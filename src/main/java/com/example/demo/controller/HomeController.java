package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Student;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home(){
		return "Home...";
	}
	
	@RequestMapping("/deneme")
	public String deneme(){
		return "Deneme...";
	}
	
	@RequestMapping("/student")
	public Student getStudent(){
		return new Student(1L, "Metin", "Aln", "3");
	}
	
	@RequestMapping("/allStudent")
	public List<Student> getAllStudents(HttpServletResponse response){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1L, "Metin", "Aln", "3"));
		list.add(new Student(2L, "Ahmet", "Ümit", "4"));
		list.add(new Student(3L, "Cem", "Uğur", "2"));
		
		return list;
	}
}
