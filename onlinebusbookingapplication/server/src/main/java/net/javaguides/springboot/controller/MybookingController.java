package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Booking;
import net.javaguides.springboot.model.Mybooking;
import net.javaguides.springboot.model.Userdetail;
import net.javaguides.springboot.repository.BookingRepository;
import net.javaguides.springboot.repository.MybookingookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import net.javaguides.springboot.model.Busoperator;
import net.javaguides.springboot.repository.BusoperatorRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class MybookingController {
    @Autowired
    private MybookingookingRepository mybookingookingRepository;

    @GetMapping("/mybooking/{username}")
    public ResponseEntity<Mybooking> getMybooking(@PathVariable String username) {
        System.out.println(username);
        Mybooking mybooking = mybookingookingRepository.findById(username)
                .orElseThrow(() -> new ResourceNotFoundException("user not exist with password :" + username));
        return ResponseEntity.ok(mybooking);
    }





}
