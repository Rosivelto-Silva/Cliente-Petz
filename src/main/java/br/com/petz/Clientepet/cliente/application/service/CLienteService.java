package br.com.petz.Clientepet.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.Clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.Clientepet.cliente.application.api.ClienteIdResponse;
import br.com.petz.Clientepet.cliente.application.api.ClienteListResponse;
import br.com.petz.Clientepet.cliente.application.api.ClienteRequest;

public interface CLienteService {
	ClienteIdResponse cadastraNovoCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> listaCliente();
	ClienteDetalhadoResponse clienteDetalhado(UUID idCliente);
}
