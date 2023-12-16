package com.renocrewsolutaion.vehicle.Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Properties {
 
	private String type;

	public Properties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Properties(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Properties [type=" + type + "]";
	}


}