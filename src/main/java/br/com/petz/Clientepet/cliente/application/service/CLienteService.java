package br.com.petz.Clientepet.cliente.application.service;

import br.com.petz.Clientepet.cliente.application.api.ClienteIdResponse;
import br.com.petz.Clientepet.cliente.application.api.ClienteRequest;

public interface CLienteService {
	ClienteIdResponse cadastraNovoCliente(ClienteRequest clienteRequest);
}
