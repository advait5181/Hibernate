package com.student.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@Column
	private int id;

	@Column
	private String Firstname;

	@Column
	private String Lastname;

	public Student() {

	}

	public Student(int id, String firstname, String lastname) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
	}

}
