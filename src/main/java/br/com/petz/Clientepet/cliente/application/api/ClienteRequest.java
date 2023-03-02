package br.com.petz.Clientepet.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.petz.Clientepet.cliente.domain.Sexo;
import lombok.Getter;

@Getter
public class ClienteRequest {
	private String nomeCompleto;
	private String email;
	private String celular;
	private String telefone;
	private String cpf;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAtualizacao;
}
