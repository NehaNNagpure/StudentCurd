package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")
public class Student {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int stud_id;
	private String stud_name;
	private String stud_address;
	private int stud_marks;
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_address() {
		return stud_address;
	}
	public void setStud_address(String stud_address) {
		this.stud_address = stud_address;
	}
	public int getStud_marks() {
		return stud_marks;
	}
	public void setStud_marks(int stud_marks) {
		this.stud_marks = stud_marks;
	}
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_address=" + stud_address
				+ ", stud_marks=" + stud_marks + "]";
	}
	
	
	
}
