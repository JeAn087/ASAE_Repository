package com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Models;

import java.util.List;

import com.unicauca.asae.gestion_trabajos_grado_service.Services.Roles.ERoles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "Roles")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RolEntity {
    @Id @Column(name = "id_Rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;

    @Column(nullable =  false, name = "rol", length = 50)
    @Enumerated(EnumType.STRING)
    private ERoles rolAsignado;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "objRol")
    private List<HistoricoEntity> historicoList;

}
