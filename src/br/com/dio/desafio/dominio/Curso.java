package br.com.dio.desafio.dominio;

public class Curso {

	private String titulo;
	private String descuicao;
	private Integer cargaHoraria;

	public Curso() {
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
	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descuicao=" + descuicao + ", cargaHoraria=" + cargaHoraria + "]";
	}

}
