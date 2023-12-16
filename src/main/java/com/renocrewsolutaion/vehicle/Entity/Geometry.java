package com.renocrewsolutaion.vehicle.Entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class Geometry {
   
	private String type;
	@ManyToOne
	   @JoinColumn( insertable =  false, updatable = false)
    @ElementCollection(targetClass = Coordinate.class)
    private List<Coordinate> coordinates;
	
    public Geometry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Geometry(String type, List<Coordinate> coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Coordinate> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(List<Coordinate> coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "Geometry [type=" + type + ", coordinates=" + coordinates + ", getType()=" + getType()
				+ ", getCoordinates()=" + getCoordinates() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

    

}