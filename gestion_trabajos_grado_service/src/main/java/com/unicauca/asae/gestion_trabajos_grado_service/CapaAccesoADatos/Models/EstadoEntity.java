package com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Models;

import java.util.Date;

import com.unicauca.asae.gestion_trabajos_grado_service.Services.Estados.EstadosEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Estados")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class EstadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstado;

    
    @Column(nullable =  false, name = "estado", length = 50)
    @Enumerated(EnumType.STRING)
    private EstadosEnum estadoActual;

    @Column(name = "fecha_registro",nullable = false)
    private Date fechaRegistroEstado;

    @OneToOne
    @JoinColumn(name = "idFormatoA")
    private FormatoAEntity formatoA;



}
