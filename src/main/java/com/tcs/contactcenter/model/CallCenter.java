package com.tcs.contactcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CALL_CENTER")
public class CallCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CCE", nullable = false,updatable = false,length = 3)
    private String idCce;

    @Column(name = "NOMBRE",nullable = false,length = 64)
    private String name;

    @Column(name = "DESCRIPCION",length = 256,nullable = false)
    private String description;

    @Column(name = "ACTIVO",nullable = false)
    private Boolean state;
}
