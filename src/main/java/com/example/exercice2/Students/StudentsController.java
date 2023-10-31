package com.example.exercice2.Students;

import com.example.exercice2.Students.Models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public List<Student> findAll(@RequestParam(value = "firstname", required = false) String firstname) {
        return studentsService.findAll(firstname);
    }

    @GetMapping("/{id}")
    public Optional<Student> findOne(@PathVariable() String id) {
        return studentsService.findOne(id);
    };

    @DeleteMapping("/{id}")
    public void delete(@PathVariable() String id) {
        studentsService.delete(id);
    }

    @PatchMapping("/{id}")
    public Student update(@PathVariable() String id, @RequestBody() Student student) throws Exception {
        return studentsService.update(id, student);
    }
}
