package com.example.demoRESTDB.controller;

import com.example.demoRESTDB.entity.Student;
import com.example.demoRESTDB.exception.StudentNotFoundException;
import com.example.demoRESTDB.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repository;

    StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "Welcome to the REST API Project";
    }
    @GetMapping("/all")
    List<Student> all() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Student one (@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }

    @PostMapping("/changedata/{id}")
    Student changeSubject(@RequestBody String newSubject, @PathVariable Long id) {

        return repository.findById(id)
                .map(student -> {
                    student.setSubject(newSubject);
                    return repository.save(student);
                })
                .orElseThrow(() -> new StudentNotFoundException(id));
    }
    @DeleteMapping("/delete/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

