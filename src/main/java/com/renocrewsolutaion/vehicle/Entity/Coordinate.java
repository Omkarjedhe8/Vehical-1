package com.renocrewsolutaion.vehicle.Entity;

import java.math.BigDecimal;

import jakarta.persistence.Embeddable;

@Embeddable
public class Coordinate {
   
	private BigDecimal lat;
    private BigDecimal lng;

    public Coordinate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coordinate(BigDecimal lat, BigDecimal lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	public BigDecimal getLat() {
		return lat;
	}
	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}
	public BigDecimal getLng() {
		return lng;
	}
	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "Coordinate [lat=" + lat + ", lng=" + lng + "]";
	}	
    
    
}
