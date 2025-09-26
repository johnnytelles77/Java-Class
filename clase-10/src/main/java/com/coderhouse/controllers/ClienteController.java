package com.coderhouse.controllers;

import org.springframework.http.MediaType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.coderhouse.models.Cliente;
import com.coderhouse.repositories.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes() {
        return ResponseEntity.ok(clienteRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        return clienteRepository.findById(id)
                .map(cliente -> ResponseEntity.ok(cliente))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping(
    	    consumes = {"application/json", "application/json;charset=UTF-8"},
    	    produces = MediaType.APPLICATION_JSON_VALUE
    	)
    	public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
    	    Cliente saved = clienteRepository.save(cliente);
    	    return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    	}

}
 