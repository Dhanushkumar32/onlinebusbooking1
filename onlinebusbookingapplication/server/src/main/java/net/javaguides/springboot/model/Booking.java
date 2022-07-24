package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "bus_number")
    private String busNumber;

    @Column(name = "source")
    private String source;

    @Column(name = "destination")
    private String destination;

    @Column(name = "number_of_seats")
    private String numberOfSeats;

    @Column(name = "amount")
    private String amount;

    @Column(name = "date")
    private String date;

    @Column(name = "journey_start_time")
    private String journeyStartTime;

    @Column(name = "journey_end_time")
    private String journeyEndTime;

    @Column(name = "status")
    private String status;



    public Booking() {

    }

    public Booking(String username, String busNumber, String source, String destination, String numberOfSeats,String amount,String date,
                   String journeyStartTime,String journeyEndTime,String status) {


        super();
        this.username = username;
        this.busNumber = busNumber;
        this.source = source;
        this.destination = destination;
        this.numberOfSeats = numberOfSeats;
        this.amount = amount;
        this.date = date;
        this.journeyStartTime = journeyStartTime;
        this.journeyEndTime = journeyEndTime;
        this.status = status;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getBusNumber() {
        return busNumber;
    }
    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getJourneyStartTime() {
        return journeyStartTime;
    }
    public void setJourneyStartTime(String journeyStartTime) {
        this.journeyStartTime = journeyStartTime;
    }
    public String getJourneyEndTime() {
        return journeyEndTime;
    }
    public void setJourneyEndTime(String journeyEndTime) {
        this.journeyEndTime = journeyEndTime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
