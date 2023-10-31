package com.example.exercice2.Students;

import com.example.exercice2.Students.Models.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service()
public class StudentsService {
    private final StudentsRepository studentsRepository;

    public StudentsService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public Student create(Student student) {
        return studentsRepository.save(student);
    }

    public List<Student> findAll() {
        return studentsRepository.findAll();
    }

    public Optional<Student> findOne(String id) {
        return studentsRepository.findById(id);
    }

    public void delete(String id) {
        studentsRepository.deleteById(id);
    }

    public Student update(String id, Student studentDto) throws Exception {
        Student student = studentsRepository.findById(id).orElse(null);

        if(student != null) {
            BeanUtils.copyProperties(studentDto, student, "id");
            return studentsRepository.save(student);
        }

        // A voir comment throw les erreurs quand le student n'est pas trouvé et gérer les types de la focntion
        return student;
    }
}
