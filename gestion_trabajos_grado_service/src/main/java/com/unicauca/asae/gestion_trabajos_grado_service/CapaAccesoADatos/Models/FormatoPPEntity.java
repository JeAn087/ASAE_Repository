package com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity @Table(name = "FormatosPPA")
@Getter @Setter
public class FormatoPPEntity extends FormatoAEntity{
    @Column(nullable = false ,length = 80)
    private String nombreAsesor;

    @Column(nullable = false ,length = 80)
    private String nombreEstudiante;

    @Column(nullable = false ,length = 255)
    private String rutaCartaAceptacion;

    public FormatoPPEntity() {
        super();
    }

    public FormatoPPEntity(Integer idFormatoA, String nombreDirector, String objetivoGeneral,
            String objetivosEspecíficos, EstadoEntity estado, DocenteEntity objDocente,
            List<EvaluacionEntity> evaluacionesList, String nombreAsesor, String nombreEstudiante,
            String rutaCartaAceptacion) {
        super(idFormatoA, nombreDirector, objetivoGeneral, objetivosEspecíficos, estado, objDocente, evaluacionesList);
        this.nombreAsesor = nombreAsesor;
        this.nombreEstudiante = nombreEstudiante;
        this.rutaCartaAceptacion = rutaCartaAceptacion;
    }





}
