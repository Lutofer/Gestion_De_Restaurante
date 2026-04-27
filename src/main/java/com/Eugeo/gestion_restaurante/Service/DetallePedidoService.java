package com.Eugeo.gestion_restaurante.Service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.Eugeo.gestion_restaurante.Entity.DetallePedido;
import com.Eugeo.gestion_restaurante.Repository.DetallePedidoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DetallePedidoService {

    private final DetallePedidoRepository repository;

    public List<DetallePedido> findAll() {
        return repository.findAll();
    }

    public DetallePedido findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Detalle no encontrado"));
    }

    public void delete(Long id) {
        DetallePedido detalle = findById(id);
        repository.deleteById(detalle.getId());
    }
}