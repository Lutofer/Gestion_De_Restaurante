package com.Eugeo.gestion_restaurante.Service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.Eugeo.gestion_restaurante.Entity.TipoProducto;
import com.Eugeo.gestion_restaurante.Repository.TipoProductoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TipoProductoService {

    private final TipoProductoRepository repository;

    public List<TipoProducto> findAll() {
        return repository.findAll();
    }

    public TipoProducto findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Tipo no encontrado"));
    }

    public TipoProducto create(TipoProducto tipo) {
        if (tipo.getId() != null) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "El tipo ya tiene ID");
        }
        return repository.save(tipo);
    }

    public TipoProducto update(Long id, TipoProducto tipo) {
        TipoProducto aux = findById(id);
        aux.setNombre(tipo.getNombre());
        return repository.save(aux);
    }

    public void delete(Long id) {
        TipoProducto tipo = findById(id);
        repository.deleteById(tipo.getId());
    }
}
