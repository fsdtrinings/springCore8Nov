package com.rapipay.ormapp.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "RapipayEmployee")
@Cacheable(value = true)
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

@NamedQuery(name = "QueryForTotalEmpCount",query = "select count(e) from Employee e")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(name="Employee_Salary",nullable = true)
	private int salary;
	private String designation;
	private int age;
	
	@ManyToOne
	@JoinColumn(name="OrgName")
	private Organisation org;
	
	/*
	@Embedded
	@Column(nullable = false)
	private Address permanentAddress;
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "houseNumber",column = @Column(name="current_houseNumber")),
			@AttributeOverride(name = "cityName",column = @Column(name="current_cityName")),
			@AttributeOverride(name = "stateName",column = @Column(name="current_stateName"))
			})
	private Address currentAddress;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<SalarySlip> salaryslips;
	
	*/
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String name, int salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

// =====================  Getter & Setters ======
	
	

	public int getId() {
		return id;
	}

	public Organisation getOrg() {
		return org;
	}



	public void setOrg(Organisation org) {
		this.org = org;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", age=" + age + ", org=" + org + "]";
	}
	
	
// ------------------------------------------------------
	
	
	

	
	

}
