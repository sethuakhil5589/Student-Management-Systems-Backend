package com.akhil.service;

import java.util.List;
import java.util.Optional;

import com.akhil.model.Students;

public interface IStudentService {
	List<Students> getAllStudents();
	String savingStudentData(Students student);
	String deleteById(Long id);
	String updatingStudentData(Long id, Students student);
	Optional<Students> fetchStudentById(Long id);
	String deleteByid(Long id);
}
