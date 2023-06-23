package org.techhub.SpringMVCCrudeApplicationFirst.service;

import java.util.List;

import org.techhub.SpringMVCCrudeApplicationFirst.model.Student;

public interface StudentService {
 public boolean isAddStudent(Student model);
 public List<Student> getAllStudents();
 public boolean isDeleteById(int userid);
 public boolean update(Student model);
 public List<Student>Search(String name);
}
