package com.example.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.entity.Patient;
@Repository
public interface patrepo extends JpaRepository<Patient,Integer> {

}
