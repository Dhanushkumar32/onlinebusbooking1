package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Busoperatordetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Busoperator;

@Repository
public interface BusoperatordetailRepository extends JpaRepository<Busoperatordetail, String>{

}
