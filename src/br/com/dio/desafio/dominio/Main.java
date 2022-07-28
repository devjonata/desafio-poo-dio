package br.com.dio.desafio.dominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescuicao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescuicao("Descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria java");
		mentoria1.setDescuicao("Descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
	}

}
