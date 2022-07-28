package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria java");
		mentoria1.setDescricao("Descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev = new Dev();
		dev.setNome("Jonata");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
		dev.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev.getConteudosConcluidos());
		System.out.println("Xp: " + dev.calcularXpTotal());
		
		
		System.out.println("============================");
		Dev dev1 = new Dev();
		dev1.setNome("Camila");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev1.getConteudosConcluidos());
		System.out.println("Xp: " + dev1.calcularXpTotal());
		
		
	}

}
