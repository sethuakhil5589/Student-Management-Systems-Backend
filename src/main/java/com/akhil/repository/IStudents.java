package com.akhil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhil.model.Students;

public interface IStudents extends JpaRepository<Students, Long> {

}
