package br.com.petz.Clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/cliente")
public interface ClienteAPI {

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	ClienteIdResponse postCadastraNovoCliente(@RequestBody ClienteRequest clienteRequest); 
	
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	List<ClienteListResponse> getListaTodosClientes();
	
	@GetMapping("{idCliente}")
	@ResponseStatus(value = HttpStatus.OK)
	ClienteDetalhadoResponse getVisualizaDetalhesCliente(@PathVariable UUID idCliente);
}
