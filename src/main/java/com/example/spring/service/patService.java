package com.example.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Patient;
import com.example.spring.repo.patrepo;

@Service
public class patService {
	@Autowired
	private patrepo repo;
public void addpat(Patient p) {
	repo.save(p);
}
public List<Patient> getAllPat(){
	return repo.findAll();
}
public Patient getPatByid(int id) {
	Optional<Patient> p=repo.findById(id);
	if(p.isPresent())
		return p.get();
	else
		return null;
}
public void deletepat(int id) {
	repo.deleteById(id);
}
}
