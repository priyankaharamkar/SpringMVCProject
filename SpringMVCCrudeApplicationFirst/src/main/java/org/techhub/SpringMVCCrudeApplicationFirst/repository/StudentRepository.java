package org.techhub.SpringMVCCrudeApplicationFirst.repository;

import java.util.List;

import org.techhub.SpringMVCCrudeApplicationFirst.model.Student;

public interface StudentRepository {
public boolean isAddStudent(Student model);
public List<Student> getAllStudents();
public boolean isDeleteById(int userid);
public boolean update(Student model);
public List<Student>Search(String name);
}
