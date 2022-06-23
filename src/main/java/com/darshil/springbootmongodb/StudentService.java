package com.darshil.springbootmongodb;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Optional<Student> getStudentById(String studentId) {
        if (studentRepository.findById(studentId) == null) {
            throw new IllegalStateException("Student with id: " + studentId + " not found");
        } else {
            return studentRepository.findById(studentId);
        }
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> insertStudents(List<Student> students) {
        try {
            return studentRepository.insert(students);
        } catch (Exception e) {
            throw new IllegalStateException("Meals were not inserted properly");
        }
    }

    public Student updateStudent(String studentId, Student updatedStudent) {
        if (getStudentById(studentId) == null) {
            throw new IllegalStateException("Student with this ID does not exist");
        } else {
            try {
                return studentRepository.save(updatedStudent);
            } catch (Exception e) {
                throw new IllegalStateException("Student was not updated");
            }
        }
    }

    public void deleteStudentById(String studentId) {
        studentRepository.deleteById(studentId);
    }

    public void deleteStudents(List<String> studentIds) {
        studentRepository.deleteAllById(studentIds);
    }

}
