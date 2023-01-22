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
@Table(name = "TRANSACCION")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRN", nullable = false,updatable = false)
    private String idTrn;

    @ManyToOne
    @JoinColumn(name = "ID_INT", nullable = false)
    private Interaction idInt;

    @Column(name = "ID_CRC")
    private String idCrc;

    @Column(name = "ID_CMR")
    private String idCmr;

    @ManyToOne
    @JoinColumn(name = "ID_CTR")
    private TransactionCatalog idCtr;

    @Column(name = "CODIGOS_CTR",length = 256)
    private String ctrCodes;

    @Column(name = "APLICA_VAL",nullable = false)
    private Boolean applyVal;

    @ManyToOne
    @JoinColumn(name = "ID_CVL")
    private ValidationCatalog idCvl;

    @Column(name = "CODIGOS_CVL",length = 256)
    private String cvlCodes;

    @Column(name = "PROCESO_CRITICO",nullable = false)
    private Boolean criticalProcess;

    @Column(name = "FECHA", nullable = false)
    private LocalDateTime date;

    @Column(name = "NUM_RECLAMO",length = 16)
    private String claimNum;

    @Column(name = "NUM_INCIDENTE",length = 16)
    private String incidentNum;

    @Column(name = "DETALLE",nullable = false,length = 256)
    private String detail;

    @Column(name = "CTA_TERCERO",length = 16)
    private String ctaThird;

    @Column(name = "CED_TERCERO",length = 16)
    private String cedThird;

    @Column(name = "FIRMA_AUTORIZADA",length = 32)
    private String authorizedSignature;

    @Column(name = "RESUELTO_PRIMER_CONT")
    private Boolean resolvedFirstCont;

    @Column(name = "DESC_RES_PRIM_CONT",length = 10)
    private String descResPrimCont;
}
