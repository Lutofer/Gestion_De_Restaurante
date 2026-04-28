package com.Eugeo.gestion_restaurante.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eugeo.gestion_restaurante.Entity.TipoProducto;
import com.Eugeo.gestion_restaurante.Service.TipoProductoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/tipos-producto")
@RequiredArgsConstructor
public class TipoProductoController {
    private final TipoProductoService service;

    @GetMapping
    public List<TipoProducto> findAll() {
        return service.findAll();
    }
}
