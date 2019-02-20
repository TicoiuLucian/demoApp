package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Part;
import com.example.demo.repository.PartRepository;

@RestController
@RequestMapping("/part")
public class PartController {

	@Autowired
	private PartRepository partRepository;
	
	@GetMapping("s")
	public List<Part> getAllParts() {
	    return partRepository.findAll();
	}
	
	@GetMapping("/{id}")
    public Optional<Part> getPartById(@PathVariable long id) {
        return partRepository.findById(id);
    }
	
	@GetMapping("/name/{name}")
	public List<Part> getPartByName(@PathVariable String name) {
		return partRepository.findByName(name);
	}
	
	@DeleteMapping("/{id}")
	public void deletePart(@PathVariable long id) {
		partRepository.deleteById(id);
	}
	
	@PostMapping
	public Part savePart(@RequestBody Part p)
	{
		return partRepository.save(p);
	}
	
	@PutMapping("/{id}")
	public Part updatePart(@RequestBody Part p){
		return partRepository.save(p);
	}
	
}
