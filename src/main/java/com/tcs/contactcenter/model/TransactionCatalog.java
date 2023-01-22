package com.tcs.contactcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CATALOGO_TRANSACCION")
public class TransactionCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CTR", nullable = false,updatable = false)
    private String idCtr;

    @ManyToOne
    @JoinColumn(name = "ID_CCE",nullable = false)
    private CallCenter idCce;

    @ManyToOne
    @JoinColumn(name = "ID_CTR_PADRE")
    private TransactionCatalog idCtrParent;

    @Column(name = "CODIGO_ORIGEN",nullable = false,length = 8)
    private String originCode;

    @Column(name = "OPCION",nullable = false,length = 32)
    private String option;

    @Column(name = "ACTIVO",nullable = false)
    private Boolean state;
}
