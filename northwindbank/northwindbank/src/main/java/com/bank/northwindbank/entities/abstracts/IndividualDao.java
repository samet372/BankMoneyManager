package com.bank.northwindbank.entities.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.northwindbank.entities.concretes.Individual;

public interface IndividualDao extends JpaRepository<Individual, Integer>{

}
