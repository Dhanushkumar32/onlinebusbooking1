package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Booking;
import net.javaguides.springboot.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Busoperator;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}
