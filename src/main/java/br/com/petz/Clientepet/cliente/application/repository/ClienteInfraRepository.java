package br.com.petz.Clientepet.cliente.application.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.petz.Clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final SpringDataJpaRepository repository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		Cliente salvaCliente = repository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return salvaCliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
		List<Cliente> listaClientes = repository.findAll();
		log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
		return listaClientes;
	}

}
