package com.Eugeo.gestion_restaurante.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eugeo.gestion_restaurante.Entity.Cliente;
import com.Eugeo.gestion_restaurante.Service.ClienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @GetMapping
    public List<Cliente> findAll() {
        return service.findAll();
    }
}
