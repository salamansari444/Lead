package com.expleo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expleo.exception.LeadExistException;
import com.expleo.model.Lead;
import com.expleo.repo.LeadRepo;

@Service
public class LeadService {
		
	@Autowired
	private LeadRepo repo;
	
	public Lead saveLead(Lead lead) {
		if(repo.findByLeadId(lead.getLeadId()).isPresent()) {
			System.out.println("Exception ::::::");
			throw new LeadExistException("Lead already exist with lead id :: "+lead.getLeadId());
		}
		return repo.save(lead);
	}
	
	public List<Lead> getLeadsByMobileNumber(String mobileNumber) {
        return repo.findByMobileNumber(mobileNumber);
    }
}
