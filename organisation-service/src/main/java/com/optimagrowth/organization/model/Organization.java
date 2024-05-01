package com.optimagrowth.organization.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Organization {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "contactName")
    private String contactName;

    @Column(name = "contactEmail")
    private String contactEmail;

    @Column(name = "contactPhone")
    private String contactPhone;

}
