package com.example.demo.repositories;

import com.example.demo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "data",path = "students")
public interface StudentRepository extends JpaRepository<Student,Long> {

}
