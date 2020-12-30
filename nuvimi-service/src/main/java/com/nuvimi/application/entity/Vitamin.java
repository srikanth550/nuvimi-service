package com.nuvimi.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vitamins")
public class Vitamin {

	@Id
	@Column(name = "vitamin_name")
	private String vitaminName;

	@Column(name = "vit_sci_name")
	private String vitaminScientificName;

	@Column(name = "unit_of_mass")
	private String unitOfMass;

	public String getVitaminName() {
		return vitaminName;
	}

	public void setVitaminName(String vitaminName) {
		this.vitaminName = vitaminName;
	}

	public String getVitaminScientificName() {
		return vitaminScientificName;
	}

	public void setVitaminScientificName(String vitaminScientificName) {
		this.vitaminScientificName = vitaminScientificName;
	}

	public String getUnitOfMass() {
		return unitOfMass;
	}

	public void setUnitOfMass(String unitOfMass) {
		this.unitOfMass = unitOfMass;
	}
}
