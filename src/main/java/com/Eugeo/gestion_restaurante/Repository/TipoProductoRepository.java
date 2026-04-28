package com.Eugeo.gestion_restaurante.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eugeo.gestion_restaurante.Entity.TipoProducto;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProducto, Long> {

    Optional<TipoProducto> findByNombre(String nombre);
}
