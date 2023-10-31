package com.example.exercice2.Students;

import com.example.exercice2.Students.Models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service()
public class StudentsService {
    private List<Student> studentList = new ArrayList();

    public Student create(Student student) {
        studentList.add(student);

        System.out.println(studentList);

        return student;
    }

    public List<Student> findAll() {
        return studentList;
    }

    public Student findOne(int id) {
        Student student = studentList.stream()
                .filter(s -> s.getId() == id)
                .findAny()
                .orElse(null);

        System.out.println(student);
        return student;
    }

    public void delete(int id) {
        Student student = studentList.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        studentList.remove(student);
    }

    public Student update(int id, Student student) {
        Student student = studentList.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);

        if(student) {
            student.setAge(student.age)

        }

    }
}
