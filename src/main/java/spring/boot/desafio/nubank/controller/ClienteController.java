package spring.boot.desafio.nubank.controller;

import spring.boot.desafio.nubank.dto.ClientesDTO;
import spring.boot.desafio.nubank.dto.ClientesResponseDTO;
import spring.boot.desafio.nubank.dto.ContatoResponseDTO;
import spring.boot.desafio.nubank.model.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.boot.desafio.nubank.service.ClientesService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping
    public ResponseEntity<Clientes> criar(@RequestBody ClientesDTO dto) {
        Clientes clientesSalvo = clientesService.salvarClientes(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(clientesSalvo);
    }

    @GetMapping
    public ResponseEntity<List<ClientesResponseDTO>> listarTodos() {
        return ResponseEntity.ok(clientesService.listarTodos());

    }

    @GetMapping("/{id}/contatos")
    public ResponseEntity<List<ContatoResponseDTO>> listarContatos(@PathVariable Long id) {
        return ResponseEntity.ok(clientesService.listarContatosPorCliente(id));
    }
}