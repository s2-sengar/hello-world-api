package com.springboothello.helloworldapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    
    @RequestMapping("/course")
    public List<Course> fetchCourses(){
        return Arrays.asList(
            new Course(0,"Angular","ZM"),
            new Course(1,"Spring boot in 100 steps","In28Minutes")
        );
    }
}
