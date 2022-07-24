package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "bus_number")
    private String busNumber;

    @Column(name = "total_seats")
    private String totalSeats;

    @Column(name = "fare")
    private String fare;

    @Column(name = "case_number")
    private String caseNumber;

    public Bus() {

    }

    public Bus(String busNumber, String totalSeats, String fare, String caseNumber) {


        super();
        this.busNumber = busNumber;
        this.totalSeats = totalSeats;
        this.fare = fare;
        this.caseNumber = caseNumber;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getBusNumber() {
        return busNumber;
    }
    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }
    public String getTotalSeats() {
        return totalSeats;
    }
    public void setTotalSeats(String totalSeats) {
        this.totalSeats = totalSeats;
    }
    public String getFare() {
        return fare;
    }
    public void setFare(String fare) {
        this.fare = fare;
    }
    public String getCaseNumber() {
        return caseNumber;
    }
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }
}
