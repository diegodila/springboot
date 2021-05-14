package com.diegodila.IT_Service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="db_itservice")
public class IT_ServiceModel {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	
	private Long id;
	private String itservice;
	private String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItservice() {
		return itservice;
	}
	public void setItservice(String itservice) {
		this.itservice = itservice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
