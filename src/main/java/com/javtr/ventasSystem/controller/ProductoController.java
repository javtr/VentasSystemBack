package com.javtr.ventasSystem.controller;


import com.javtr.ventasSystem.model.Producto;
import com.javtr.ventasSystem.model.Proveedor;
import com.javtr.ventasSystem.service.ClienteService;
import com.javtr.ventasSystem.service.ProductoService;
import com.javtr.ventasSystem.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
@CrossOrigin
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/save")
    public String add(@RequestBody Producto producto){
        System.out.println("cont: " + producto);

        productoService.saveProducto(producto);
        return "producto agregado";

    }



}
