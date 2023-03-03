package br.com.petz.Clientepet.cliente.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.Clientepet.cliente.application.service.CLienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

	private final CLienteService clienteService;

	@Override
	public ClienteIdResponse postCadastraNovoCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCadastraNovoCliente");
		ClienteIdResponse cliente = clienteService.cadastraNovoCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCadastraNovoCliente");
		return cliente;
	}

	@Override
	public List<ClienteListResponse> getListaTodosClientes() {
		log.info("[inicia] ClienteController - getListaTodosClientes");
		List<ClienteListResponse> clienteList = clienteService.listaCliente();
		log.info("[finaliza] ClienteController - getListaTodosClientes");
		return clienteList;
	}

}
