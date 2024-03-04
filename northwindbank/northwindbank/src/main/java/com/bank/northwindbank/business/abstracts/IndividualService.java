package com.bank.northwindbank.business.abstracts;

import java.util.List;

import com.bank.northwindbank.entities.concretes.Individual;

public interface IndividualService {
	
	List<Individual> getAll();
	
	float deposit(int accoundNumber, float amount);
	
	float withdraw(int accoundNumber, float amount);
	
	float getBalance(int accoundNumber);
}
