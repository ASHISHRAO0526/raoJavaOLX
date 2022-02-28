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
public class AdvertismentStatus {


	@Column(name = "adv_status_id")
	private int id;
	
	@Transient
	private String status;
	
	public AdvertismentStatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	public AdvertismentStatus(String status) {
		super();
		this.status = status;
	}
	public AdvertismentStatus(int id) {
		super();
		this.id = id;
	}
	public AdvertismentStatus() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AdvertismentStatus [id=" + id + ", status=" + status + "]";
	}
	
	
	
	
	
}
