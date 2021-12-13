package com.hibmap.tables;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Instructor {
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", instructor_detail=" + instructor_detail + "]";
	}

	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name", length = 70)
	private String name;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "instructor_detail_id")
	private InstructorDetail instructor_detail;
	
	public InstructorDetail getInstructor_detail() {
		return instructor_detail;
	}

	public void setInstructor_detail(InstructorDetail instructor_detail) {
		this.instructor_detail = instructor_detail;
	}

	public int getId() {
		return id;
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
}
