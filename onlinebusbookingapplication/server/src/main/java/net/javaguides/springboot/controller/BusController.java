package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Bus;
import net.javaguides.springboot.model.Busroute;
import net.javaguides.springboot.repository.BusRepository;
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
public class BusController {
    @Autowired
    private BusRepository busRepository;

    // create employee rest api
    @PostMapping("/addbus")
    public Bus addBus(@RequestBody Bus bus) {
        return busRepository.save(bus);
    }


    @GetMapping("/getallbuses")
    public List<Bus> getAllbuses(){
        return busRepository.findAll();
    }

    @DeleteMapping("/addbus/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteBus(@PathVariable Long id){
        Bus bus = busRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        busRepository.delete(bus);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }




}
