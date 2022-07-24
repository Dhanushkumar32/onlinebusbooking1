package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Bus;
import net.javaguides.springboot.model.Busroute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Busoperator;

@Repository
public interface BusrouteRepository extends JpaRepository<Busroute, Long>{

}
