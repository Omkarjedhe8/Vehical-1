package com.renocrewsolutaion.vehicle.Entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Embeddable
public class Feature {
	
	@Id
	 private int id;
	
    private String type;
    @Embedded
    @ManyToOne
    @JoinColumn( insertable =  false, updatable = false)
    private Properties properties;
    @ManyToOne
    @JoinColumn( insertable =  false, updatable = false)
    private Geometry geometry;
	public Feature() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feature(int id, String type, Properties properties, Geometry geometry) {
		super();
		this.id = id;
		this.type = type;
		this.properties = properties;
		this.geometry = geometry;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	@Override
	public String toString() {
		return "Feature [id=" + id + ", type=" + type + ", properties=" + properties + ", geometry=" + geometry + "]";
	}


	

}