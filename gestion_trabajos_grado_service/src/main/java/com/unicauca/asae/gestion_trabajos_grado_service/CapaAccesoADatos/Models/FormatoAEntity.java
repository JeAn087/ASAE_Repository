package com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "FormatosA")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public abstract class FormatoAEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFormatoA;

    @Column(nullable = false ,length = 80)
    private String nombreDirector;

    @Column(nullable = false ,columnDefinition = "TEXT")
    private String objetivoGeneral;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String objetivosEspecíficos;

    @OneToOne(mappedBy = "formatoA")
    private EstadoEntity estado;

    @ManyToOne
    @JoinColumn(referencedColumnName =  "id_docente")
    private DocenteEntity objDocente;

    @OneToMany(mappedBy = "formatoAEntity", fetch =  FetchType.LAZY, cascade =  {CascadeType.PERSIST, CascadeType.PERSIST})
    private List<EvaluacionEntity> evaluacionesList;
    


}
