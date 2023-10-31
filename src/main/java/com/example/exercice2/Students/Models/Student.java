package com.example.exercice2.Students.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data()
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private int age;
}
