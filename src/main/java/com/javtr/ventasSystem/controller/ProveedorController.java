package com.javtr.ventasSystem.controller;
import com.javtr.ventasSystem.model.Proveedor;
import com.javtr.ventasSystem.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proveedor")
@CrossOrigin
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @PostMapping("/save")
    public String add(@RequestBody Proveedor proveedor){
        System.out.println("cont: " + proveedor);

        proveedorService.saveProveedor(proveedor);
        return "proveedor agregado";

    }

}
