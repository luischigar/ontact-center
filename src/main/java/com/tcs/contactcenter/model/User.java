package com.tcs.contactcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USUARIO")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USU", nullable = false,updatable = false)
    private String idUsu;

    @Column(name = "ID_CCE", nullable = false,length = 3)
    private String idCce;

    @Column(name = "ID_CTU", nullable = false,length = 3)
    private String idCtu;

    @Column(name = "AGENTE", nullable = false,length = 8)
    private String agent;

    @Column(name = "ULTIMATIX", nullable = false,length = 8)
    private String ultimatix;

    @Column(name = "NOMBRE", nullable = false,length = 32)
    private String name;

    @Column(name = "APELLIDO", nullable = false,length = 32)
    private String surname;

    @Column(name = "PASSWORD", nullable = false,length = 32)
    private String password;

    @Column(name = "AGENTE_CREACION", nullable = false,length = 8)
    private String creationAgent;

    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "AGENTE_MODIFICACION",length =8)
    private String modificationAgent;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime modificationDate;

    @Column(name = "ACTIVO",nullable = false,length =8)
    private Boolean state;
}
