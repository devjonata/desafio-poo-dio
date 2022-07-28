package br.com.dio.desafio.dominio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Mentoria {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String titulo;
	private String descuicao;
	private LocalDate data;

	public Mentoria() {
		super();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescuicao() {
		return descuicao;
	}
	
	public void setDescuicao(String descuicao) {
		this.descuicao = descuicao;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descuicao=" + descuicao + ", data=" + data + "]";
	}
	
}
