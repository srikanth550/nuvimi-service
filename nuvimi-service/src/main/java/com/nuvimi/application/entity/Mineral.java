package com.nuvimi.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "minerals")
public class Mineral {

	@Id
	@Column(name = "mineral_name")
	private String mineralName;

	@Column(name = "min_sci_name")
	private String mineralScientificName;

	@Column(name = "unit_of_mass")
	private String unitOfMass;

	public String getMineralName() {
		return mineralName;
	}

	public void setMineralName(String mineralName) {
		this.mineralName = mineralName;
	}

	public String getMineralScientificName() {
		return mineralScientificName;
	}

	public void setMineralScientificName(String mineralScientificName) {
		this.mineralScientificName = mineralScientificName;
	}

	public String getUnitOfMass() {
		return unitOfMass;
	}

	public void setUnitOfMass(String unitOfMass) {
		this.unitOfMass = unitOfMass;
	}
}
