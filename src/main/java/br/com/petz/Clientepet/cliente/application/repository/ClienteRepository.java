package br.com.petz.Clientepet.cliente.application.repository;

import java.util.List;

import br.com.petz.Clientepet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}
