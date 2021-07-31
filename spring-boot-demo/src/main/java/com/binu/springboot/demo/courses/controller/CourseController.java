package com.binu.springboot.demo.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binu.springboot.demo.courses.model.Course;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

	@GetMapping("/courses")
	public List<Course> getallCourses() {
		return Arrays.asList(new Course(1L,"Microservice Architectures","Mark Meadows"));
	}
	
	
}
