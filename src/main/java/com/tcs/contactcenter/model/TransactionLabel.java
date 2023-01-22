package com.tcs.contactcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ETIQUETA_TRANSACCION")
public class TransactionLabel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ETR", nullable = false,updatable = false,length = 3)
    private String idEtr;

    @ManyToOne
    @JoinColumn(name = "ID_CCE",nullable = false)
    private CallCenter idCce;

    @Column(name = "NOMBRE",nullable = false,length = 32)
    private String name;

    @Column(name = "NIVEL",nullable = false)
    private Integer level;

    @Column(name = "DESCRIPCION",length = 128)
    private String description;

    @Column(name = "ACTIVO",nullable = false)
    private Boolean state;
}
