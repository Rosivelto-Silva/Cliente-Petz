package br.com.petz.Clientepet.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.petz.Clientepet.cliente.application.api.ClienteIdResponse;
import br.com.petz.Clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.Clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements CLienteService {

	@Override
	public ClienteIdResponse cadastraNovoCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - cadastraNovoCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - cadastraNovoCliente");
		return cliente;
	}

}
