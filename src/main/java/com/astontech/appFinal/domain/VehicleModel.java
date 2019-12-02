package com.astontech.appFinal.domain;

import javax.persistence.*;

@Entity
public class VehicleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VehicleModelId")
    private Integer id;

    @Version
    private Integer version;
}