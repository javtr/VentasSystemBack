package com.javtr.ventasSystem.service;

import com.javtr.ventasSystem.model.Cliente;
import com.javtr.ventasSystem.model.Producto;
import com.javtr.ventasSystem.repository.ClienteRepository;
import com.javtr.ventasSystem.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }


}
