package com.javtr.ventasSystem.controller;

import com.javtr.ventasSystem.model.Cliente;
import com.javtr.ventasSystem.model.Producto;
import com.javtr.ventasSystem.repository.ClienteRepository;
import com.javtr.ventasSystem.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteRepository clienteRepository;


    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    //@PostMapping("/save")
    public String add(@RequestBody Cliente cliente){
        System.out.println("cont: " + cliente);
        clienteService.saveCliente(cliente);
        return "cliente agregado";

    }

    @GetMapping("/{clienteId}/productos")
    Set<Producto> getSetProductos(
            @PathVariable String clienteId
    ){
        Cliente cliente = clienteRepository.findById(clienteId).get();
        return cliente.getProductos();
    }


}
