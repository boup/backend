package com.advisor.adtrans.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="ticket")
public class Ticket extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TicketId;

    @Column
    private  String Duration;
    @Column
    private String TypeofTicket;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CityID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private City city;


    public Ticket() {
    }


    public Ticket(String duration, String typeofTicket) {
        Duration = duration;
        TypeofTicket = typeofTicket;
    }

    public Long getTicketId() {
        return TicketId;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getTypeofTicket() {
        return TypeofTicket;
    }

    public void setTypeofTicket(String typeofTicket) {
        TypeofTicket = typeofTicket;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

