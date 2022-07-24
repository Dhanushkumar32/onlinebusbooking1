package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Busoperator;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long>{

}
