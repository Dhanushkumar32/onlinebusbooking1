package net.javaguides.springboot.repository;
import net.javaguides.springboot.model.Mybooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MybookingookingRepository extends JpaRepository<Mybooking, String>{

}
