package com.javtr.ventasSystem.repository;
import com.javtr.ventasSystem.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,String> {

}
