package com.advisor.adtrans.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="city")
public class City extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private  String CityName;
    @Column
    private  String longitude;

    @Column
    private String Latitude;


//    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Line> line;
//    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Operator> operator;
//    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Ticket> ticket;
//    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<TransCity> transcity;

    public City()  {
    }

    public City(String cityName, String longitude, String latitude) {
        CityName = cityName;
        this.longitude = longitude;
        Latitude = latitude;
    }

    public Long getId() {
        return Id;
    }
//    //public Long getciityID() {
//        return CityID;
//    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public void setId(Long id) {
        Id = id;
    }
//
//    public Set<Line> getLine() {
//        return line;
//    }
//
//    public void setLine(Set<Line> line) {
//        this.line = line;
//    }
//
//    public Set<Operator> getOperator() {
//        return operator;
//    }
//
//    public void setOperator(Set<Operator> operator) {
//        this.operator = operator;
//    }
//
//    public Set<Ticket> getTicket() {
//        return ticket;
//    }
//
//    public void setTicket(Set<Ticket> ticket) {
//        this.ticket = ticket;
//    }
//
//    public Set<TransCity> getTranscity() {
//        return transcity;
//    }
//
//    public void setTranscity(Set<TransCity> transcity) {
//        this.transcity = transcity;
//    }
}
