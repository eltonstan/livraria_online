package br.com.caelum.livraria.dominio;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TelefoneTest {
	
	@Test
	public void formatar() {
		Cliente cliente = new Cliente("1", "22", "11", "55555555");
		
		assertThat(cliente.getTelefone(), is(equalTo("(11) 55555555")));
	}
}
