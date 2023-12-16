package com.renocrewsolutaion.vehicle.Entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class GeoJson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    
    
   @JoinColumn( insertable =  false, updatable = false)
   private Feature features;
	public GeoJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GeoJson(Long id, String type, List<Feature> features) {
		super();
		this.id = id;
		this.type = type;
		this.features = (Feature) features;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Feature getFeatures() {
		return  features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = (Feature) features;
	}
	@Override
	public String toString() {
		return "GeoJson [id=" + id + ", type=" + type + ", features=" + features + "]";
	}
    
    
    
    
}