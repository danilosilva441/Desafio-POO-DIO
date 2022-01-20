package br.com.dio.desafio.dominio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.entities.Curso;
import br.com.dio.desafio.dominio.entities.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Programação POO com Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Programação POO com JavaScript");
		curso2.setCargaHoraria(6);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Curso em Java");
		mentoria.setDescricao("Aprendendo os conceitos de POO em Java");
		mentoria.setData(LocalDate.now());
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println(mentoria);
		


	}

}
