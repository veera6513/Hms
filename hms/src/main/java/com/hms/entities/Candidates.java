package com.hms.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Candidates {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidates_id;

	private String firstname;
	private String lastname;
	private int exp;
	private int noticeperiod;
	private String phoneno;
	private String email;

	@OneToMany(mappedBy = "candidates", cascade = CascadeType.ALL)
	private List<Candidates_skills> candidates_skill = new ArrayList<>();
	

	public int getCandidates_id() {
		return candidates_id;
	}

	public void setCandidates_id(int candidates_id) {
		this.candidates_id = candidates_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getNoticeperiod() {
		return noticeperiod;
	}

	public void setNoticeperiod(int noticeperiod) {
		this.noticeperiod = noticeperiod;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Candidates_skills> getCandidates_skill() {
		return candidates_skill;
	}

	public void setCandidates_skill(List<Candidates_skills> candidates_skill) {
		this.candidates_skill = candidates_skill;
	}

}