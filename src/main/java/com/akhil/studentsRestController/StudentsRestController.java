package com.akhil.studentsRestController;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.model.Students;
import com.akhil.service.StudentServiceImpl;

@RestController
@RequestMapping(("/api"))
@CrossOrigin(origins="http://localhost:5173/")
public class StudentsRestController {
	
	@Autowired
	private StudentServiceImpl service;
	
	@GetMapping("/Students")
	public List<Students> fetchingData(){
		return service.getAllStudents();
	}
	
	@PostMapping("/Student")
	public List<Students> savingData(@RequestBody Students student){
		service.savingStudentData(student);
		System.out.println(student);
		return service.getAllStudents();
	}
	
	@GetMapping("/Student/{id}")
	public Optional<Students> updateByIdGetMap(@PathVariable Long id, Students student){
		System.out.println(student);
		return service.fetchStudentById(id);
	}
	
	@PutMapping("/Student/{id}")
	public List<Students> updateByIdPostMap(@PathVariable Long id, @RequestBody Students student){
		Students stud=new Students();
		stud.setStudentId(student.getStudentId());
		stud.setStudentName(student.getStudentName());
		stud.setStudentAddress(student.getStudentAddress());
		stud.setStudentEmail(student.getStudentEmail());
		stud.setStudentClass(student.getStudentClass());
		stud.setStudentPhoneNumber(student.getStudentPhoneNumber());
		stud.setStudentFatherName(student.getStudentFatherName());
		service.savingStudentData(stud);
		System.out.println(student);
		return service.getAllStudents();
	}
	
	@DeleteMapping("/Student/{id}")
	public List<Students> deleteById(@PathVariable Long id){
		service.deleteByid(id);
		return service.getAllStudents();
	}
}
