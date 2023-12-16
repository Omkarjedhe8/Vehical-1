package com.renocrewsolutaion.vehicle.Controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.WKTReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.renocrewsolutaion.vehicle.Entity.Vechicle;
import com.renocrewsolutaion.vehicle.Repository.VechicleRepository;
import com.renocrewsolutaion.vehicle.Service.VechicleService;

import jakarta.transaction.Transactional;

@RequestMapping("/vechicle")
@RestController
public class VechicleController {

	@Autowired
	private VechicleService vechicleService;
	
	private VechicleRepository vechicalRepository;

	public VechicleController(VechicleService vechicleService) {
		super();
		this.vechicleService = vechicleService;
	}

	// Getting List of all Vechicles
	@GetMapping
	public List<Vechicle> getAll() {

		return vechicleService.getAllVechicle();
	}

	// Getting Vechicle by id
	@GetMapping("/{id}")
	public Optional<Vechicle> getVechicle(@PathVariable Long id) {
		return vechicleService.getVechicleById(id);

	}

	// Create/Post the Vechicle
	@PostMapping("/save")
	public ResponseEntity<Vechicle> saveVechicle(@RequestBody Vechicle vechicle) {
		Vechicle newVechicle = vechicleService.createVechicle(vechicle);
		return new ResponseEntity<>(newVechicle, HttpStatus.CREATED);

	}

	//Updating the vechicle Information
	@PutMapping("/update/{id}")
	public ResponseEntity<Vechicle> updateVechicle( @PathVariable("id") Long id, @RequestBody Vechicle vechicle) {
		Vechicle updateVechicle = vechicleService.UpdateVechicle(vechicle);
		return new ResponseEntity<>(updateVechicle, HttpStatus.CREATED);

	}
	

	/*
	 * @GetMapping("/within-polygon")
	 * 
	 * @Transactional public List<Vechicle>
	 * getVehiclesWithinPolygon(@RequestParam("polygon") String polygonWkt) throws
	 * org.locationtech.jts.io.ParseException { // Parse the WKT (Well-Known Text)
	 * representation of the polygon WKTReader wktReader = new WKTReader(); Geometry
	 * polygon = wktReader.read(polygonWkt);
	 * 
	 * // Perform a spatial query to get vehicles within the specified polygon
	 * List<Vechicle> vehiclesWithinPolygon =
	 * VechicleRepository.findVehiclesWithinPolygon(polygon);
	 * 
	 * return vehiclesWithinPolygon; }
	 */    	
	@DeleteMapping("/remove/{id}")
	public String deleteVechicalById( @PathVariable Long id) {

		return vechicleService.deleteVechicle(id);
	}

	
	
	
	
}
