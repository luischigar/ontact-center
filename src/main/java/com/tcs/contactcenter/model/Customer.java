package com.tcs.contactcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CLIENTE")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLI", nullable = false,updatable = false)
    private String idCli;

    @ManyToOne
    @JoinColumn(name = "ID_CCL",nullable = false)
    private GeneralCatalogDetail idCcl;

    @ManyToOne
    @JoinColumn(name = "ID_CID",nullable = false)
    private GeneralCatalogDetail idCid;

    @Column(name = "IDENTIFICACION",nullable = false,length = 16)
    private String identification;

    @Column(name = "RAZON_SOCIAL",length = 128)
    private String reasonSocial;

    @Column(name = "NOMBRES",length = 32)
    private String names;

    @Column(name = "APELLIDOS",length = 32)
    private String surnames;

    @Column(name = "TEL_RESIDENCIA",length = 32)
    private String residenceTel;

    @Column(name = "DIR_RESIDENCIA",length = 256)
    private String residenceDir;

    @Column(name = "TEL_OFICINA",length = 32)
    private String officeTel;

    @Column(name = "DIR_OFICINA",length = 256)
    private String officeDir;

    @Column(name = "EXT_OFICINA",length = 16)
    private String officeExt;

    @Column(name = "FAX_OFICINA",length = 16)
    private String officeFax;

    @Column(name = "EXT_FAX_OFICINA",length = 16)
    private String officeExtFax;

    @Column(name = "CELULAR",length = 32)
    private String cellPhone;

    @Column(name = "EMAIL",length = 128)
    private String email;

    @Column(name = "GENERO",length = 1)
    private char gender;

    @Column(name = "FECHA_NACIMIENTO")
    private LocalDate birthDate;

    @Column(name = "AGENTE_CREACION",length = 8)
    private String creationAgent;

    @Column(name = "FECHA_CREACION")
    private LocalDateTime creationDate;

    @Column(name = "AGENTE_MODIFICACION",length = 8)
    private String modificationAgent;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime modificationDate;
}
