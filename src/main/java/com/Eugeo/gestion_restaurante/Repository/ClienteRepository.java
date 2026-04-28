package com.Eugeo.gestion_restaurante.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eugeo.gestion_restaurante.Entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    Optional<Cliente> findByDni(String dni);

    Boolean existsByDni(String dni);
}
