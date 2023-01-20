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
@Table(name = "INTERACCION")
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INT", nullable = false,updatable = false)
    private String idInt;

    @ManyToOne
    @JoinColumn(name = "ID_USU",nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "ID_CLI",nullable = false)
    private Customer customer;

    @Column(name = "ID_ACD", nullable = false)
    private String idAcd;

    @ManyToOne
    @JoinColumn(name = "ID_CNS")
    private GeneralCatalogDetail idCns;

    @ManyToOne
    @JoinColumn(name = "ID_CTC")
    private GeneralCatalogDetail idCtc;

    @ManyToOne
    @JoinColumn(name = "ID_CEI")
    private GeneralCatalogDetail idCei;

    @ManyToOne
    @JoinColumn(name = "ID_CTI")
    private GeneralCatalogDetail idCti;

    @Column(name = "FECHA", nullable = false)
    private LocalDateTime date;

    @Column(name = "DATO_CONTACTO", nullable = false,length = 64)
    private String contactInformation;

    @Column(name = "CALL_ID",length = 32)
    private String callId;

    @Column(name = "NUMERO_UNICO",length = 50)
    private String uniqueNumber;

    @Column(name = "OPCION",length = 4)
    private String option;

    @Column(name = "FECHA_NACIMIENTO_CLI",length = 10)
    private String dateOfBirthCli;

    @Column(name = "FIRMA_AUTORIZADA",length = 32)
    private String authorizedSignature;

    @Column(name = "RESULTADO_AUT")
    private Boolean resultAut;

    @Column(name = "ENCUESTA")
    private Boolean poll;

    @Column(name = "PRIORIDAD")
    private Integer priority;

    @Column(name = "FECHA_FINALIZACION")
    private LocalDateTime endDate;

    @Column(name = "TIEMPO_CONTACTO",length = 8)
    private String contactTime;

}
