package br.com.petz.Clientepet.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.petz.Clientepet.cliente.application.repository.ClienteRepository;
import br.com.petz.Clientepet.cliente.domain.Cliente;
import br.com.petz.Clientepet.handler.APIException;
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

	@Override
	public Cliente buscaClientePorId(UUID idCliente) {
		log.info("[inicia] ClienteInfraRepository - buscaClientePorId");
		var cliente = repository.findById(idCliente).orElseThrow(() -> APIException.build(HttpStatus.INTERNAL_SERVER_ERROR, "INFORME AO ADIMINISTRADOR DO SISTEMA"));
		log.info("[finaliza] ClienteInfraRepository - buscaClientePorId");
		return cliente;
	}

}
