package com.tcs.contactcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CATALOGO_GENERAL_DETALLE")
public class GeneralCatalogDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CTD", nullable = false,updatable = false)
    private String idCtd;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "ID_CTG", referencedColumnName = "ID_CTG",nullable = false)
    })
    private GeneralCatalog idCtg;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "ID_CCE", referencedColumnName = "ID_CCE",nullable = false)
    })
    private GeneralCatalog idCce;

    @Column(name = "NOMBRE",nullable = false,length = 32)
    private String name;

    @Column(name = "DESCRIPCION",length = 256)
    private String description;

    @Column(name = "ACTIVO",nullable = false)
    private Boolean state;
}
