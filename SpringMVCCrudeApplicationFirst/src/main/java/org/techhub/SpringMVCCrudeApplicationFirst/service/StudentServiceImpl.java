package org.techhub.SpringMVCCrudeApplicationFirst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.SpringMVCCrudeApplicationFirst.model.Student;
import org.techhub.SpringMVCCrudeApplicationFirst.repository.StudentRepository;
@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepo;
	@Override
	public boolean isAddStudent(Student model) {
		boolean b=studentRepo.isAddStudent(model);
		return b;
	}
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.getAllStudents();
	}
	@Override
	public boolean isDeleteById(int userid) {
		// TODO Auto-generated method stub
		
		return studentRepo.isDeleteById(userid);
	}
	@Override
	public boolean update(Student model) {
		// TODO Auto-generated method stub
		return studentRepo.update(model);
	
	}
	@Override
	public List<Student> Search(String name) {
		// TODO Auto-generated method stub
		return studentRepo.Search(name);
	}

}
