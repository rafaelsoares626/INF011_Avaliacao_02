package Model;

import java.util.ArrayList;
import java.util.List;

public class Ementa{
	
	private List<Disciplina> disciplinas;
	private List<Livro> livros;
	private String nome;
	private String codigo;
	private double chTotal;
	
	public Ementa(List<Disciplina>disciplinas, List<Livro>livros, String nome, String codigo) {
		this.disciplinas = disciplinas;
		this.livros = livros;	
		this.nome = nome;
		this.codigo = codigo;	
		for(Disciplina disciplina : this.disciplinas) {
			this.chTotal += disciplina.getChTotal();
		}
	}
	
	public String mostrarLivrosCurso() {		
		List<String> livrosCurso = new ArrayList<String>();		
		for(Livro livro : this.livros) {
			livrosCurso.add(livro.getNome());
		}		
		return livrosCurso.toString();
	}
	
	public String mostrarDisciplinasCurso() {		
		List<String> disciplinasCurso = new ArrayList<String>();		
		for(Disciplina disciplina : this.disciplinas) {
			disciplinasCurso.add(disciplina.getNome());
		}		
		return disciplinasCurso.toString();
	}
	
	public void mostrar() {
		System.out.println("EMENTA DO CURSO" + "\n\nNome do curso: " + this.nome + "\n\nCodigo do curso: " + this.codigo +
						   "\n\nCarga horaria do curso: "+ this.chTotal + " Horas" + "\n\nDisciplinas do curso: " + this.mostrarDisciplinasCurso() +
						   "\n\nLivros do curso: " + this.mostrarLivrosCurso());
	}	

}
