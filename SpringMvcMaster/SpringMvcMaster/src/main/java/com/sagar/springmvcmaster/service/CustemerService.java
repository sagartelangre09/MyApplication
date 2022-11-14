package com.sagar.springmvcmaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.springmvcmaster.model.CustemerDetails;
import com.sagar.springmvcmaster.repository.CustemerRepository;

@Service
public class CustemerService {
@Autowired
CustemerRepository repository;
public CustemerDetails addCustemer(CustemerDetails cd)
{
	System.out.println("in custemerservice");
	return repository.save(cd);
}
}
