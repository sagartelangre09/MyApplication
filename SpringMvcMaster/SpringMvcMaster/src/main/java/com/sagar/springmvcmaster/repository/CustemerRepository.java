package com.sagar.springmvcmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.springmvcmaster.model.CustemerDetails;

public interface CustemerRepository extends JpaRepository<CustemerDetails, Integer> {
	
}
