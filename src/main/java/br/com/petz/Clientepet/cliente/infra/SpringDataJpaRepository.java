package br.com.petz.Clientepet.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.Clientepet.cliente.domain.Cliente;

public interface SpringDataJpaRepository extends JpaRepository<Cliente, UUID>{

}
