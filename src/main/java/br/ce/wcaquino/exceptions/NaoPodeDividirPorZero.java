package br.ce.wcaquino.exceptions;

public class NaoPodeDividirPorZero extends Exception {

	private static final long serialVersionUID = 1L;

	public NaoPodeDividirPorZero(String msg) {
		super(msg);
	}
}
