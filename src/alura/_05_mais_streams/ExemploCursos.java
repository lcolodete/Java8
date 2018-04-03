package alura._05_mais_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Curso {

	private String nome;
	private int alunos;
	
	public Curso (String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
	
	
	
}

public class ExemploCursos {
	
	public static void main(String[] args) {
		
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		cursos.add(new Curso("HTML5", 101));

		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findFirst()
			.ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.mapToInt(Curso::getAlunos)
			.average()
			.ifPresent(avg -> System.out.println("Média de alunos por curso é "+avg));

		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.collect(Collectors.toList())
			.forEach(c -> System.out.println(c.getNome()));
		
	}
}