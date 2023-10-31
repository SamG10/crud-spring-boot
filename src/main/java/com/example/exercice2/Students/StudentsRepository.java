package com.example.exercice2.Students;

import com.example.exercice2.Students.Models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentsRepository extends MongoRepository<Student, String> {
}
