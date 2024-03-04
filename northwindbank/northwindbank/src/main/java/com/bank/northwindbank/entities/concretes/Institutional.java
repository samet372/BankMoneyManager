package com.bank.northwindbank.entities.concretes;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="institutionals")
public class Institutional{    //institutional user data

	@Id
	@GeneratedValue
	@Column(name="id")	
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAddress;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="account_number")
	private int accountNumber;
	
	@Column(name="balance")
	private BigInteger balance;


	public Institutional(int id, String companyName, String webAddress, String email, String password,
			String phoneNumber, int accountNumber, BigInteger balance) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigInteger getBalance() {
		return balance;
	}

	public void setBalance(BigInteger cent) {
		this.balance = cent;
	}
	
}
