package com.example.exercice2.Students;

import com.example.exercice2.Students.Models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("students")
public class StudentsController {
    private final StudentsService studentsService;

    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @PostMapping()
    public Student create(@RequestBody() Student student) {
        return studentsService.create(student);
    }

    @GetMapping()
    public List<Student> findAll() {
        return studentsService.findAll();
    }

    @GetMapping("/{id}")
    public Student findOne(@PathVariable() int id) {
        return studentsService.findOne(id);
    };

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() int id) {
        studentsService.delete(id);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable() int id, @RequestBody() Student student) {
        return studentsService.update(id, student);
    }
}
