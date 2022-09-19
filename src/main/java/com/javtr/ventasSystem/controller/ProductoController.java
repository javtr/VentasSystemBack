package com.javtr.ventasSystem.controller;


import com.javtr.ventasSystem.model.Cliente;
import com.javtr.ventasSystem.model.Producto;
import com.javtr.ventasSystem.model.Proveedor;
import com.javtr.ventasSystem.repository.ClienteRepository;
import com.javtr.ventasSystem.repository.ProductoRepository;
import com.javtr.ventasSystem.service.ClienteService;
import com.javtr.ventasSystem.service.ProductoService;
import com.javtr.ventasSystem.service.ProveedorService;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.Subject;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/producto")
@CrossOrigin
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/save")
    public String add(@RequestBody Producto producto){
        System.out.println("cont: " + producto);

        productoService.saveProducto(producto);
        return "producto agregado";

    }



    @PutMapping("/{productoId}/compra/{clienteId}")
    Producto addStudentToSubject(
            @PathVariable String productoId,
            @PathVariable String clienteId
    ) {
        Producto producto = productoRepository.findById(productoId).get();
        Cliente cliente = clienteRepository.findById(clienteId).get();
        producto.clientes.add(cliente);
        return productoRepository.save(producto);
    }




}
