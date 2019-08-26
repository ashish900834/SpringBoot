package com.ashish.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ashish.vo.Student;

public interface StudentDao extends CrudRepository<Student,Integer> {
	
	@Transactional
    void deleteByName(String name );

}
