package com.srienath.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srienath.restapp.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
	@Query("select cid from Course")
	public List<Integer> getIDList();
}
