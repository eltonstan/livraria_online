package br.com.caelum.livraria.dominio;

import java.util.Arrays;
import java.util.List;

public class Autor {
	
	private final String nome;

	public Autor(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		StringBuilder autor = new StringBuilder();
		getTrechosDoNomeDoAutor().stream().forEach(parteDoNome -> {
			autor.append(capitalize(parteDoNome));
			autor.append(" ");
		});
		return autor.toString().trim();
	}
	
	public String getUltimoSobrenomeDoAutor() {
		List<String> nomes = getTrechosDoNomeDoAutor();
		return capitalize(nomes.get(nomes.size() - 1));
	}
	
	public List<String> getTrechosDoNomeDoAutor() {
		return Arrays.asList(nome.split(" "));
	}
	
	private String capitalize(String nome) {
		return Character.toUpperCase(nome.charAt(0)) + nome.substring(1).toLowerCase();
	}
	
}
