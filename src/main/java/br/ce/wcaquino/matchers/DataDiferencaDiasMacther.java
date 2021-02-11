package br.ce.wcaquino.matchers;

import java.util.Date;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import br.ce.wcaquino.utils.DataUtils;

public class DataDiferencaDiasMacther extends TypeSafeMatcher<Date> {

	private Integer quantidadeDias;
	
	public DataDiferencaDiasMacther(Integer quantidadeDias) {
		this.quantidadeDias = quantidadeDias;
	}
	
	public void describeTo(Description description) {
		description.appendText(DataUtils.obterDataComDiferencaDias(quantidadeDias)+"");

	}

	@Override
	protected boolean matchesSafely(Date data) {
		return DataUtils.isMesmaData(data, DataUtils.obterDataComDiferencaDias(quantidadeDias));
	}

}
