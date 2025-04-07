package com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicauca.asae.gestion_trabajos_grado_service.CapaAccesoADatos.Models.EstadoEntity;

public interface EstadoRepository extends JpaRepository<EstadoEntity, Integer>{

}
