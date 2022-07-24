package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Bus;
import net.javaguides.springboot.model.Busroute;
import net.javaguides.springboot.repository.BusRepository;
import net.javaguides.springboot.repository.BusrouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import net.javaguides.springboot.model.Busoperator;
import net.javaguides.springboot.repository.BusoperatorRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BusrouteController {
    @Autowired
    private BusrouteRepository busrouteRepository;

    // create employee rest api
    @PostMapping("/addbusroute")
    public Busroute addBusroute(@RequestBody Busroute busroute) {
        return busrouteRepository.save(busroute);
    }

    @GetMapping("/getbuses")
    public List<Busroute> getBuses(){
        return busrouteRepository.findAll();
    }

    // delete show rest api
    @DeleteMapping("/addbusroute/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteBus(@PathVariable Long id){
        Busroute busroute = busrouteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        busrouteRepository.delete(busroute);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }




}
