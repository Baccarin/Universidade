package com.baccarin.universidade.exceptions;

public class RegistroNaoEncontradoException extends Exception {

	private static final long serialVersionUID = 1L;

	public RegistroNaoEncontradoException(Object classe, Long id) {
		super ("Registro do tipo: " + classe + " de id: " + id + " não foi encontrado.");
	}
}
