package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring.entity.Patient;
import com.example.spring.service.patService;

import jakarta.servlet.http.HttpSession;

@Controller
public class Hospitalcontroller {

	@Autowired
	private patService serv;

	@GetMapping("/")
	public String home(Model m) {
		
		
		List<Patient>pat=serv.getAllPat();
		m.addAttribute("pat",pat);
		return "index";
	}

	@GetMapping("/AddPatient")
	public String addpat() {

		return "AddPatient";
	}

	@PostMapping("/register")
	public String patregister(@ModelAttribute Patient p, HttpSession session) {
		System.out.println(p);
		serv.addpat(p);
		session.setAttribute("msg", "Patient Data added Succesfully...");
		return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m) {
		
		Patient p=serv.getPatByid(id);
		m.addAttribute("pat", p);
		return "edit";
	}
	@PostMapping("/update")
	public String update(@ModelAttribute Patient p, HttpSession session) {
		
		serv.addpat(p);
		session.setAttribute("msg", "Patient Record updated Succesfully....");
		return "redirect:/";
		
	}
	@GetMapping("/delete/{id}")
public String delete(@PathVariable int id,HttpSession session) {
		serv.deletepat(id);
		session.setAttribute("msg","Patient record deleted...");
	return "redirect:/";
}

}
