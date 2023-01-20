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
}
