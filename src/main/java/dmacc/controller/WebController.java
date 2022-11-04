package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Guitar;
import dmacc.repository.GuitarRepository;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Nov 1, 2022
 */

@Controller
public class WebController {
	@Autowired
	GuitarRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllGuitars(Model model){
		if(repo.findAll().isEmpty()) {
			return addNewGuitar(model);
		}
		
		model.addAttribute("guitars", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputGuitar")
	public String addNewGuitar(Model model) {
		Guitar g = new Guitar();
		model.addAttribute("newGuitar", g);
		return "input";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateGuitar(@PathVariable("id") long id, Model model) {
		Guitar g = repo.findById(id).orElse(null);
		model.addAttribute("newGuitar", g);
		return "input";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Guitar g = repo.findById(id).orElse(null);
		repo.delete(g);
		return viewAllGuitars(model);
	}
	
	@PostMapping("/inputGuitar")
	public String addNewGuitar(@ModelAttribute Guitar g, Model model) {
		repo.save(g);
		return viewAllGuitars(model);
	}
	
	@PostMapping("/update/{id}")
	public String reviseGuitar(Guitar g, Model model) {
		repo.save(g);
		return viewAllGuitars(model);
	}

}

