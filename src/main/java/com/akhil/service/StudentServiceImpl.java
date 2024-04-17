package com.akhil.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.model.Students;
import com.akhil.repository.IStudents;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudents repo;
	
	@Override
	public List<Students> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public String savingStudentData(Students student) {
		repo.save(student);
		return "Student data Successfully with id: "+student.getStudentId();
	}

	@Override
	public String deleteById(Long id) {
		repo.deleteById(id);
		return "Student data deleted by: "+ id;
	}

	@Override
	public String updatingStudentData(Long id, Students student) {
		repo.save(student);
		return "Record saved with id: "+id;
	}

	@Override
	public Optional<Students> fetchStudentById(Long id) {
		return repo.findById(id);
	}

	@Override
	public String deleteByid(Long id) {
		repo.deleteById(id);
		return "Record deleted with id: "+id;
	}
	
	

}
