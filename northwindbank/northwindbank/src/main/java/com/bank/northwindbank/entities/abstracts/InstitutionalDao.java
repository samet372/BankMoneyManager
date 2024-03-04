package com.bank.northwindbank.entities.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.northwindbank.entities.concretes.Institutional;

public interface InstitutionalDao extends JpaRepository<Institutional, Integer>{

}
