package com.expleo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expleo.exception.LeadExistException;
import com.expleo.model.Lead;
import com.expleo.service.LeadService;

@RestController
@RequestMapping("/api")
public class LeadController {

	@Autowired
	private LeadService service;

	@PostMapping("/save")
	public ResponseEntity<?> saveLead(@RequestBody Lead lead){
			Lead resLead = service.saveLead(lead);
        	return new ResponseEntity<>(resLead,HttpStatus.OK);  
		
	}
	
	@GetMapping("/mobileNumber/{mobileNumber}")
    public ResponseEntity<?> getLeadsByMobileNumber(@PathVariable String mobileNumber) {
        List<Lead> leads = service.getLeadsByMobileNumber(mobileNumber);

        if (leads.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(leads,HttpStatus.OK);
        }
    }
	
}
