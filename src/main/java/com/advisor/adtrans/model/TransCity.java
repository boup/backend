package com.advisor.adtrans.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="transcity")

public class TransCity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TransID;

    @Column
    private  String link;
    @Column
    private  Integer price;
    //private Integer CityID;
    //private  String departure;

    @Column
    private  Enum  typeoftransport;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CityID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private City city;
    public TransCity() {
    }

    public TransCity(String link, Integer price, Enum typeoftransport) {
        this.link = link;
        this.price = price;
        this.typeoftransport = typeoftransport;
    }

    public Long getTransID() {
        return TransID;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Enum getTypeoftransport() {
        return typeoftransport;
    }

    public void setTypeoftransport(Enum typeoftransport) {
        this.typeoftransport = typeoftransport;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

