package com.Eugeo.gestion_restaurante.Service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.Eugeo.gestion_restaurante.Entity.Cliente;
import com.Eugeo.gestion_restaurante.Repository.ClienteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
    
    private final ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Cliente findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Cliente no encontrado"));
    }

    public Cliente create(Cliente cliente) {

        if (cliente.getId() != null) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "El cliente ya tiene ID");
        }

        if (repository.existsByDni(cliente.getDni())) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Cliente ya registrado");
        }

        return repository.save(cliente);
    }

    public Cliente update(Long id, Cliente cliente) {
        Cliente aux = findById(id);

        aux.setNombre(cliente.getNombre());
        aux.setDni(cliente.getDni());

        return repository.save(aux);
    }

    public void delete(Long id) {
        Cliente cliente = findById(id);
        repository.deleteById(cliente.getId());
    }
}
