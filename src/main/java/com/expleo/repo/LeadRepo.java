package com.expleo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expleo.model.Lead;

public interface LeadRepo extends JpaRepository<Lead, Integer> {
    Optional<Lead> findByLeadId(Integer leadId);

}
