package com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Evaluaciones")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class EvaluacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEvalaucion;

    @Column(nullable = false ,length = 255)
    private String concepto;

    @Column(nullable = false)
    private Date fechaRegistroConcepto;

    @Column(nullable = false ,length = 80)
    private String nombreCoordinador;

    @ManyToOne
    @JoinColumn(name = "idFormatoA", nullable = false)
    FormatoAEntity formatoAEntity;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "objEvaluacion")
    private List<ObservacionEntity> observacionesList;

}
