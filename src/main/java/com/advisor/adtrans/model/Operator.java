package com.advisor.adtrans.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="operator")
public class Operator  extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OperatorID;

    @Column
    private String NameOperator;

    @Column
    private String Description;

    @Column
    private String Link;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CityID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private City city;


    public Operator() {
    }

    public Operator(String nameOperator, String description, String link, City city) {
        NameOperator = nameOperator;
        Description = description;
        Link = link;
        this.city = city;
    }

    public Integer getOperatorID() {
        return OperatorID;
    }

    public void setOperatorID(Integer operatorID) {
        OperatorID = operatorID;
    }

    public String getNameOperator() {
        return NameOperator;
    }

    public void setNameOperator(String nameOperator) {
        NameOperator = nameOperator;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
