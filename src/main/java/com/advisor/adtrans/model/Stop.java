package com.advisor.adtrans.model;


import javax.persistence.*;

@Entity
@Table(name="stop")
public class Stop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long StopID;
    @Column
    private String StopName;

    @Column
    private  String  typeof;

    public Stop() {
    }

    public Stop(String stopName, String typeof) {
        StopName = stopName;
        this.typeof = typeof;
    }

    public Long getStopID() {
        return StopID;
    }

    public void setStopID(Long stopID) {
        StopID = stopID;
    }

    public String getStopName() {
        return StopName;
    }

    public void setStopName(String stopName) {
        StopName = stopName;
    }

    public String getTypeof() {
        return typeof;
    }

    public void setTypeof(String typeof) {
        this.typeof = typeof;
    }
}
