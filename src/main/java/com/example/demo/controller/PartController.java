package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Part;
import com.example.demo.repository.PartRepository;

@RestController
public class PartController {

	@Autowired
	private PartRepository partRepository;
	
	@RequestMapping("/parts")
	public ResponseEntity<List<Part>> getAllParts() {

	    return new ResponseEntity<List<Part>>(partRepository.findAll(), HttpStatus.OK);
	}

	
//	@RequestMapping(value = "/getCountry")
//    public ResponseEntity<Country> getCountry() {
//		
//        return ResponseEntity.accepted().headers(headers).body(c);
//    }
//    
//    @RequestMapping(value = "/getCountry2")
//    @ResponseBody
//    public Country getCountry2() {
//        
//        return new Country();
//    }
	
	
}
