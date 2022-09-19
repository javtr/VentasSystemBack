package com.javtr.ventasSystem.service;
import com.javtr.ventasSystem.model.Cliente;
import com.javtr.ventasSystem.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;


    public Cliente saveCliente(Cliente cliente) {

        return clienteRepository.save(cliente);
    }



}
