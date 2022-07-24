package net.javaguides.springboot.controller;
import net.javaguides.springboot.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.javaguides.springboot.model.Busoperator;
import net.javaguides.springboot.repository.BusoperatorRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BusoperatorController {
	@Autowired
	private BusoperatorRepository busoperatorRepository;

	// create employee rest api
	@PostMapping("/busoperator")
	public Busoperator busoperatorSignup(@RequestBody Busoperator busoperator) {
		return busoperatorRepository.save(busoperator);
	}
	@GetMapping("/getbusoperator")
	public List<Busoperator> getAllbusoperator(){
		return busoperatorRepository.findAll();
	}
	

	

	
}
