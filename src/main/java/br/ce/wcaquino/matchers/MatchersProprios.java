package br.ce.wcaquino.matchers;

public class MatchersProprios {

	public static DiaSemanaMatchers caiEm(Integer diaSemana) {
		return new DiaSemanaMatchers(diaSemana);
	}

	
	public static DataDiferencaDiasMacther ehHojeComDiferencaDias(Integer quantidadeDias) {
		return new DataDiferencaDiasMacther(quantidadeDias);
	}
	
	public static DataDiferencaDiasMacther ehHoje() {
		return new DataDiferencaDiasMacther(0);
	}
}
