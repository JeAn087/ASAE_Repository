package com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Models;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Docentes")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DocenteEntity {

    @Id @Column(name = "id_docente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDocente;

    @Column(name= "nombres", nullable = false ,length = 80)
    private String nombresDocente;

    @Column(name = "apellidos", nullable = false ,length = 80)
    private String apellidosDocente;

    @Column(name = "grupo", length = 50)
    private String nombreGrupo;

    @Column(nullable = false ,length = 100)
    private String correo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "objDocente")
    private List<FormatoAEntity> formatoAList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "objDocente")
    private List<HistoricoEntity> historicoList;



}
