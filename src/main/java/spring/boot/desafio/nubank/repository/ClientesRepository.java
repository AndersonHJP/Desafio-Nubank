package spring.boot.desafio.nubank.repository;

import spring.boot.desafio.nubank.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
