package com.renocrewsolutaion.vehicle.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renocrewsolutaion.vehicle.Entity.Vechicle;
import com.renocrewsolutaion.vehicle.Repository.VechicleRepository;

@Service
public class VechicleService {

	
	@Autowired
	private VechicleRepository vechicleRepository;

	public VechicleService(VechicleRepository vechicleRepository) {
		super();
		this.vechicleRepository = vechicleRepository;
	}

	public List<Vechicle> getAllVechicle() {
		return vechicleRepository.findAll();

	}

	public Optional<Vechicle> getVechicleById(Long id) {
		return vechicleRepository.findById(id);

	}
	
	public Vechicle createVechicle(Vechicle vechicle) {
		return vechicleRepository.save(vechicle);
		
	}
	
	public Vechicle UpdateVechicle(Vechicle vechicle) {
		return vechicleRepository.save(vechicle);
		
	}
	
	public String deleteVechicle (Long id) {
		vechicleRepository.deleteById(id);
		return "Vechical Remove successfully";
	}
	
}
	
	
	
	