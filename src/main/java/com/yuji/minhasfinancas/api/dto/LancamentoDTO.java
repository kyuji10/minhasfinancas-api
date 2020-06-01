package com.yuji.minhasfinancas.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LancamentoDTO {

	private String descricao;
	private Integer mes;
	private Integer ano;
	private double valor;
	private String tipo;
	private String status;
	
}
