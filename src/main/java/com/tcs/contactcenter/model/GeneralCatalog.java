package com.tcs.contactcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CATALOGO_GENERAL")
public class GeneralCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CTG", nullable = false,updatable = false,length = 2)
    private String idCtg;

    @Id
    @Column(name = "ID_CCE", nullable = false,updatable = false,length = 3)
    private String idCce;

    @Column(name = "NOMBRE",nullable = false,length = 32)
    private String name;

    @Column(name = "DESCRIPCION",length = 256)
    private String description;

    @Column(name = "ACTIVO",nullable = false)
    private Boolean state;
}
