package com.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
@RestController
public class StudentController {
	@Autowired
	Student student;
	
	@PostMapping("/api/saveStudent")
	public void saveStudent(@RequestBody Student student) {
		System.out.println(" student "+student);
		//student.
	}
}
