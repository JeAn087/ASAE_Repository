package com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Historicos")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class HistoricoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHistorico;

    private boolean Activo;

    private Date fechaInicio;

    @Column(nullable = false)
    private Date fechaFin;

    @ManyToOne
    @JoinColumn(name = "id_docente", nullable = false)
    DocenteEntity objDocente;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    RolEntity objRol;

}
