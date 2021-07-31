package com.binu.springboot.demo.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binu.springboot.demo.courses.model.Course;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

	@GetMapping("/courses")
	public List<Course> getallCourses() {
		return Arrays.asList(new Course(1L,"Microservice Architectures","Mark Meadows"),
				new Course(2L,"Advanced Java","Peter Travers"),
				new Course(3L,"AWS Fundamentals","Kal Summers"));
	}
	
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable long id) {
		if (id == 1) {
			return new Course(1L,"Microservice Architecture 1","Mark Meadows");
		} else if (id == 2){
			return new Course(2L,"Advanced Java 2","Peter Travers");
		} else {
			return new Course(3L,"AWS Fundamentals 1","Kal Summers");
		}
	}
	
	
}
