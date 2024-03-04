package com.bank.northwindbank.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.northwindbank.business.abstracts.IndividualService;
import com.bank.northwindbank.entities.concretes.Individual;

@RestController
@RequestMapping("/api/individuals")
public class IndividualsController {
	
	private IndividualService individualService;
	@Autowired
	public IndividualsController(IndividualService individualService) {
		super();
		this.individualService = individualService;
	}

	@GetMapping("/getall")
	public List<Individual> getAll() {
		return this.individualService.getAll();
	}
	
	@GetMapping("/balance/{accoundNumber}")
	public float getbalance(@PathVariable int accoundNumber) {
		return individualService.getBalance(accoundNumber);
	}
	
	@PostMapping("/deposit/{accoundNumber}")
	public float deposit(@PathVariable int accoundNumber, @RequestParam float amount) {
		return individualService.deposit(accoundNumber, amount);
	}
	
	@PostMapping("/withdraw/{accoundNumber}")
	public float withdraw(@PathVariable int accoundNumber, @RequestParam float amount) {
		return individualService.withdraw(accoundNumber, amount);
	}
	
}
