package com.advisor.adtrans.model;


import javax.persistence.*;

@Entity
@Table(name="stop")
public class Stop extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long stopId;
    @Column
    private String stopName;

    @Column
    private  String  typeof;

    public Stop() {
    }

    public Stop(String stopName, String typeof) {
        this.stopName = stopName;
        this.typeof = typeof;
    }

    public Long getStopId() {
        return stopId;
    }

    public void setStopId(Long stopId) {
        this.stopId = stopId;
    }


    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getTypeof() {
        return typeof;
    }

    public void setTypeof(String typeof) {
        this.typeof = typeof;
    }
}
