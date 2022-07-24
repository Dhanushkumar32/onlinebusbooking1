package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Bus;
import net.javaguides.springboot.model.Busroute;
import net.javaguides.springboot.model.Feedback;
import net.javaguides.springboot.repository.BusRepository;
import net.javaguides.springboot.repository.FeedbackRepository;
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
public class FeedbackController {
    @Autowired
    private FeedbackRepository feedbackRepository;

    // create employee rest api
    @PostMapping("/addfeedback")
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @GetMapping("/getfeedback")
    public List<Feedback> getFeedback(){
        return feedbackRepository.findAll();
    }

}
