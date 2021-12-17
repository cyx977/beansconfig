package com.hibmap.tables;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(unique = true)
	private String title;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH, }, optional = false)
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;
	
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Review> reviews;

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

	public List<Review> getReview() {
		return reviews;
	}

	public void addReview(Review review) {
		if(reviews == null) {
			reviews = new ArrayList<Review>();
		}
		reviews.add(review);	
	}
}
