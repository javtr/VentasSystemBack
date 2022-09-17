package com.javtr.ventasSystem.controller;

import com.javtr.ventasSystem.model.Cliente;
import com.javtr.ventasSystem.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    //@PostMapping("/save")
    public String add(@RequestBody Cliente cliente){
        System.out.println("cont: " + cliente);
        clienteService.saveCliente(cliente);
        return "cliente agregado";

    }
}
