package com.cliente.cliente.domain.repository;

import com.cliente.cliente.domain.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientesRepository  extends JpaRepository<Clientes, Long> {
}
