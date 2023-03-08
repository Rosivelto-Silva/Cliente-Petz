package br.com.petz.Clientepet.cliente.application.api;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class ClienteAlteradoRequest {
	private String email;
	private String celular;
	private String telefone;
	private LocalDateTime dataHoraDaUltimaAlteracao;
}
