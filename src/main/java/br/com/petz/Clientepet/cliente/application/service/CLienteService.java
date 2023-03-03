package br.com.petz.Clientepet.cliente.application.service;

import java.util.List;

import br.com.petz.Clientepet.cliente.application.api.ClienteIdResponse;
import br.com.petz.Clientepet.cliente.application.api.ClienteListResponse;
import br.com.petz.Clientepet.cliente.application.api.ClienteRequest;

public interface CLienteService {
	ClienteIdResponse cadastraNovoCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> listaCliente();
}
