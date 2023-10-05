package com.leoric.studentmanagementsystem.repositories;

import com.leoric.studentmanagementsystem.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}

