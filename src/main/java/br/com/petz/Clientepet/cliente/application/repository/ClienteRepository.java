package br.com.petz.Clientepet.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.petz.Clientepet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClientePorId(UUID idCliente);
	void deletaClienteById(UUID idCliente);
}
