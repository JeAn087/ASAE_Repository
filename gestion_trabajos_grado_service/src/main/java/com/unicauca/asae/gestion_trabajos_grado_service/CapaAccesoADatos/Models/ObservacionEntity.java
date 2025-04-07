package com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Models;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Observaciones")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ObservacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idObservacion;

    @Column(nullable = false ,length = 255)
    private String observacion;

    @Column(nullable = false)
    private Date fechaRegistroObservacion;

    @ManyToOne
    @JoinColumn(name = "idEvalaucion", nullable = false)
    private EvaluacionEntity objEvaluacion;

    @ManyToMany
    @JoinTable(name = "observaciones_docentes",
    joinColumns = @JoinColumn(name = "idObservacion"),
    inverseJoinColumns = @JoinColumn(name = "id_docente"))
    private List<DocenteEntity> listaDocentesObservacion;
}
