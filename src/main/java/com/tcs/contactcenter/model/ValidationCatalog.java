package com.tcs.contactcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CATALOGO_VALIDACION")
public class ValidationCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CVL", nullable = false,updatable = false)
    private String idCvl;

    @Column(name = "ID_CCE", nullable = false,length = 3)
    private String idCce;

    @ManyToOne
    @JoinColumn(name = "ID_CVL_PADRE")
    private ValidationCatalog idCvlParent;

    @Column(name = "OPCION", nullable = false,length = 32)
    private String option;

    @Column(name = "ACTIVO", nullable = false)
    private Boolean state;
}
