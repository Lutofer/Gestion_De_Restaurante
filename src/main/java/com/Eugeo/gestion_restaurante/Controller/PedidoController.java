package com.Eugeo.gestion_restaurante.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Eugeo.gestion_restaurante.Entity.EstadoPedido;
import com.Eugeo.gestion_restaurante.Entity.Pedido;
import com.Eugeo.gestion_restaurante.Service.PedidoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService service;

    @PostMapping
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        return service.crearPedido(pedido);
    }

    @PostMapping("/{id}/agregar-producto")
    public Pedido agregarProducto(
            @PathVariable Long id,
            @RequestParam Long productoId,
            @RequestParam Integer cantidad) {

        return service.agregarProducto(id, productoId, cantidad);
    }

    @PutMapping("/{id}/estado")
    public Pedido cambiarEstado(
            @PathVariable Long id,
            @RequestParam EstadoPedido estado) {

        return service.cambiarEstado(id, estado);
    }

    @GetMapping("/ventas-hoy")
    public Double ventasHoy() {
        return service.ventasHoy();
    }
}

