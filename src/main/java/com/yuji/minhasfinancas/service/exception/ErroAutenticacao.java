package com.yuji.minhasfinancas.service.exception;

public class ErroAutenticacao extends RuntimeException{

	public ErroAutenticacao(String mensagem) {
		super(mensagem);
	}
}