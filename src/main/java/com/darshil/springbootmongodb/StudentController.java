package com.darshil.springbootmongodb;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping(path = "students/{id}")
    public Optional<Student> fetchStudentById(@PathVariable("id") String studentId) {
        return studentService.getStudentById(studentId);
    }

    @GetMapping(path = "students/all")
    public List<Student> fetchAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping(path = "students")
    public List<Student> postStudents(@RequestBody List<Student> students) {
        return studentService.insertStudents(students);
    }

    @PutMapping(path = "students/{id}")
    public Student updateStudent(@PathVariable("id") String studentId, @RequestBody Student student) {
        return studentService.updateStudent(studentId, student);
    }

    @DeleteMapping(path = "students/{id}")
    public void deleteStudentById(@PathVariable("id") String studentId) {
        studentService.deleteStudentById(studentId);
    }

    @DeleteMapping(path = "students/delete_multiple")
    public void deleteMultipleStudentsByIds(@RequestBody List<String> studentIds) {
        studentService.deleteStudents(studentIds);
    }
}
