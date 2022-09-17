package com.javtr.ventasSystem.repository;

import com.javtr.ventasSystem.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,String> {
}
