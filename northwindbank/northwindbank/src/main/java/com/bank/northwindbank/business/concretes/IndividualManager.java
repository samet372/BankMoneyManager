package com.bank.northwindbank.business.concretes;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.northwindbank.business.abstracts.IndividualService;
import com.bank.northwindbank.entities.abstracts.IndividualDao;
import com.bank.northwindbank.entities.concretes.Individual;


import jakarta.transaction.Transactional;

@Service
public class IndividualManager implements IndividualService{

	private IndividualDao individualDao;

	@Autowired
	public IndividualManager(IndividualDao individualDao) {
		super();
		this.individualDao = individualDao;
	}
	
	@Override
	public List<Individual> getAll() {
		return this.individualDao.findAll();
	}
	
	@Transactional
	@Override
	public float deposit(int accoundNumber, float amount) {
		
		Individual individual = individualDao.findById(accoundNumber).orElseThrow(() -> new IllegalArgumentException("Invalid account ID"));
		individual.setBalance(individual.getBalance() + amount);
		individual.setTransactionDate(LocalDateTime.now());
		return individual.getBalance();
	}

	@Transactional
	@Override
	public float withdraw(int accoundNumber, float amount) {
		
		 if (amount < 0) {
		        throw new IllegalArgumentException("Invalid withdrawal amount");
		    }
		 
		Individual individual = individualDao.findById(accoundNumber).orElseThrow(() -> new IllegalArgumentException("Invalid account ID"));
		if(individual.getBalance() < amount) {
			 throw new IllegalArgumentException("Insufficient funds");
		}
		individual.setBalance(individual.getBalance() - amount);
		individual.setTransactionDate(LocalDateTime.now());
		return individual.getBalance();
	}

	@Override
	public float getBalance(int accoundNumber) {
		
		Individual individual = individualDao.findById(accoundNumber).orElseThrow(() -> new IllegalArgumentException("Invalid account ID"));
		individual.setTransactionDate(LocalDateTime.now());
		return individual.getBalance();
	}

}
