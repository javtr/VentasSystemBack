package com.javtr.ventasSystem.service;

import com.javtr.ventasSystem.model.Proveedor;
import com.javtr.ventasSystem.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public Proveedor saveProveedor(Proveedor proveedor){
        return proveedorRepository.save(proveedor);
    }


}
