package com.renocrewsolutaion.vehicle.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Vechicle {

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	     private Long id;
        private String vin;
      private String numberPlate;
     private int fuel;
      private String model;
     
      @ManyToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "position_id")
      private Position position;
      
      
  
	public Vechicle(Position position) {
		super();
		this.position = position;
	}

	public Vechicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vechicle(Long id, String vin, String numberPlate, int fuel, String model) {
		super();
		this.id = id;
		this.vin = vin;
		this.numberPlate = numberPlate;
		this.fuel = fuel;
		this.model = model;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vechicle [id=" + id + ", vin=" + vin + ", numberPlate=" + numberPlate + ", fuel=" + fuel + ", model="
				+ model + ", position=" + position + "]";
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
  	
}
