package com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity @Table(name = "FormatosTIA")
@Getter @Setter 
public class FormatoTIEntity extends FormatoAEntity{
    @Column(nullable = false ,length = 80)
    private String nombreEstudiante1;

    @Column(length = 80)
    private String nombreEstudiante2;

    public FormatoTIEntity() {
        super();
    }

    public FormatoTIEntity(Integer idFormatoA, String nombreDirector, String objetivoGeneral,
            String objetivosEspecíficos, EstadoEntity estado, DocenteEntity objDocente,
            List<EvaluacionEntity> evaluacionesList, String nombreEstudiante1, String nombreEstudiante2) {
        super(idFormatoA, nombreDirector, objetivoGeneral, objetivosEspecíficos, estado, objDocente, evaluacionesList);
        this.nombreEstudiante1 = nombreEstudiante1;
        this.nombreEstudiante2 = nombreEstudiante2;
    }



    
    
}
