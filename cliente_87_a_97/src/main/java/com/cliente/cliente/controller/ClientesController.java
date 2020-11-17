package com.cliente.cliente.controller;


import com.cliente.cliente.domain.model.Clientes;
import com.cliente.cliente.domain.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping
    public List<Clientes> list(){
        return clientesRepository.findAll();
    }

    @GetMapping("/{clienteId}")
    public ResponseEntity<Clientes> busca (@PathVariable Long clienteId){

        Optional<Clientes> clientes = clientesRepository.findById(clienteId);

        if (clientes.isPresent()){
            return  ResponseEntity.ok(clientes.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Clientes add(@Valid @RequestBody Clientes clientes){
        return clientesRepository.save(clientes);
    }

    @PutMapping("/{clienteId}")
    public ResponseEntity<Clientes> update ( @Valid @PathVariable Long clienteId,
                                             @RequestBody Clientes clientes){

        if(!clientesRepository.existsById(clienteId)){
            return ResponseEntity.notFound().build();
        }
        clientes.setId(clienteId);
        clientes = clientesRepository.save(clientes);
        return ResponseEntity.ok(clientes);
    }

    @DeleteMapping("/{clienteId}")
    public ResponseEntity<Void> update (@PathVariable Long clienteId){

        if(!clientesRepository.existsById(clienteId)){
            return ResponseEntity.notFound().build();
        }
        clientesRepository.deleteById(clienteId);
        return ResponseEntity.noContent().build();
    }
}
