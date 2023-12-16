package com.renocrewsolutaion.vehicle.Repository;

import java.util.List;

import org.locationtech.jts.geom.Geometry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutaion.vehicle.Entity.Vechicle;

@Repository
public interface VechicleRepository extends JpaRepository<Vechicle ,Long>   {

	static List<Vechicle> findVehiclesWithinPolygon(Geometry polygon) {
		// TODO Auto-generated method stub
		return null;
	}

}
