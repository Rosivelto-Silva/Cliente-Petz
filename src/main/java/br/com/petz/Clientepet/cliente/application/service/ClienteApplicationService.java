package br.com.petz.Clientepet.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.petz.Clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.Clientepet.cliente.application.api.ClienteIdResponse;
import br.com.petz.Clientepet.cliente.application.api.ClienteListResponse;
import br.com.petz.Clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.Clientepet.cliente.application.repository.ClienteRepository;
import br.com.petz.Clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements CLienteService {

	private final ClienteRepository clienteRepository;

	@Override
	public ClienteIdResponse cadastraNovoCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - cadastraNovoCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - cadastraNovoCliente");
		return ClienteIdResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> listaCliente() {
		log.info("[inicia] ClienteApplicationService - listaCliente");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - listaCliente");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse clienteDetalhado(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - clienteDetalhado");
		Cliente cliente = clienteRepository.buscaClientePorId(idCliente);
		log.info("[finaliza] ClienteApplicationService - clienteDetalhado");
		return new ClienteDetalhadoResponse(cliente);
	}

}
