package com.advisor.adtrans.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="line")
//public class Line extends AuditModel {
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long lineId;

    @Column
    private Long number;
    @Column
    private String link;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private City city;


    public Line() {
    }

    public Line(Long number, String link) {
        this.number = number;
        this.link = link;
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
//    //public Long getLineID() {
//        return LineID;
//    }



    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
