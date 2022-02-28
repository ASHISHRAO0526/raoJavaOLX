package com.zensar.olx.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Embeddable
public class Category {

	@Column(name = "category_id")
	private int id;
	@Transient
	private String name;
	private String desciption;
	public Category(int id, String name, String desciption) {
		super();
		this.id = id;
		this.name = name;
		this.desciption = desciption;
	}
	public Category() {
		super();
	}
	public Category(String name, String desciption) {
		super();
		this.name = name;
		this.desciption = desciption;
	}
	public Category(int id) {
		super();
		this.id = id;
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
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", desciption=" + desciption + "]";
	}
	
	
	
	
}
