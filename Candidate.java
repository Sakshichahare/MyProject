package com.tka14;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate", schema="advjava193")
public class Candidate {

	@Id
	
	private int c_id;
	private String cname;
	private String partyname;
	private String assembly;
	private String state;
	private String gender;
	private String age;

	public Candidate() {
		super();
	}

	public Candidate(int c_id, String cname, String partyname, String assembly, String state, String gender,
			String age) {
		super();
		this.c_id = c_id;
		this.cname = cname;
		this.partyname = partyname;
		this.assembly = assembly;
		this.state = state;
		this.gender = gender;
		this.age = age;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [cname=" + cname + ", partyname=" + partyname + ", assembly=" + assembly + ", age=" + age
				+ "]";
	}

}


