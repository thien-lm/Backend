package com.alibou.security.dao;


import com.alibou.security.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository<Course, Integer> {

}
