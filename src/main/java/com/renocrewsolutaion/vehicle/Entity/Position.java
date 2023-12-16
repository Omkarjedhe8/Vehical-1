package com.renocrewsolutaion.vehicle.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Position {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long pId;
	
	private double longitude;
	
	private double latitude;
	
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "vechicle_id")
    private Vechicle vechicle;
	
	

	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Position(double longitude, double latitude, Vechicle vechicle) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.vechicle = vechicle;
	}



	public double getLongitude() {
		return longitude;
	}



	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}



	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public Vechicle getVechicle() {
		return vechicle;
	}



	public void setVechicle(Vechicle vechicle) {
		this.vechicle = vechicle;
	}



	@Override
	public String toString() {
		return "Position [longitude=" + longitude + ", latitude=" + latitude + ", vechicle=" + vechicle + "]";
	}

	
}
