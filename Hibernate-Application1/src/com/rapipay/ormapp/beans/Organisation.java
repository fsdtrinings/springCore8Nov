package com.rapipay.ormapp.beans;

import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity

public class Organisation {

	@Id
	private String orgName;
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "OrgName") private Set<Employee> employees;
	 */
	
	
	
	public Organisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	@Override
	public String toString() {
		return "Organisation [orgName=" + orgName + "]";
	}

	
	
	
	
}
