package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Booking;
import net.javaguides.springboot.model.Bus;
import net.javaguides.springboot.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import net.javaguides.springboot.model.Busoperator;
import net.javaguides.springboot.repository.BusoperatorRepository;

import java.awt.print.Book;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BookingController {
    @Autowired
    private BookingRepository bookingRepository;

    // create employee rest api
    @PostMapping("/bookbus")
    public Booking bookBusticket(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }

    @GetMapping("/getallbooking")
    public List<Booking> getAllbooking(){
        return bookingRepository.findAll();
    }

    @PutMapping("/bookbus/{id}")
    public ResponseEntity<Booking> updateBooking(@PathVariable Long id, @RequestBody Booking bookingDetails){
        System.out.println(id);
        Booking booking = bookingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        booking.setUsername(bookingDetails.getUsername());
        booking.setBusNumber(bookingDetails.getBusNumber());
        booking.setSource(bookingDetails.getSource());
        booking.setDestination(bookingDetails.getDestination());
        booking.setNumberOfSeats(bookingDetails.getNumberOfSeats());
        booking.setAmount(bookingDetails.getAmount());
        booking.setDate(bookingDetails.getDate());
        booking.setJourneyStartTime(bookingDetails.getJourneyStartTime());
        booking.setJourneyEndTime(bookingDetails.getJourneyEndTime());
        booking.setStatus(bookingDetails.getStatus());

        Booking updatedBooking = bookingRepository.save(booking);
        return ResponseEntity.ok(updatedBooking);
    }



}
