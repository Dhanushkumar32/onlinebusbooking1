package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Busoperatordetail;
import net.javaguides.springboot.model.Userdetail;
import net.javaguides.springboot.repository.BusoperatordetailRepository;
import net.javaguides.springboot.repository.UserdetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BusoperatordetailController {

    @Autowired
    private BusoperatordetailRepository busoperatordetailRepository;


    @GetMapping("/busoperatordetail/{password}")
    public ResponseEntity<Busoperatordetail> checkBusoperator(@PathVariable String password) {
        System.out.println(password);
        Busoperatordetail busoperatordetail = busoperatordetailRepository.findById(password)
                .orElseThrow(() -> new ResourceNotFoundException("user not exist with password :" + password));
        return ResponseEntity.ok(busoperatordetail);
    }


}
