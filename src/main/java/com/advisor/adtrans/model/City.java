package com.advisor.adtrans.model;


import javax.persistence.*;

@Entity
@Table(name="city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CityID;
    @Column
    private  String CityName;
    @Column
    private  String longitude;

    @Column
    private String Latitude;


    public City() {
    }

    public City(String cityName, String longitude, String latitude) {
        CityName = cityName;
        this.longitude = longitude;
        Latitude = latitude;
    }

    public Long getCityID() {
        return CityID;
    }

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
}
