package Model;

import java.util.ArrayList;
import java.util.List;

public class CursoBuilder {
	
	private List<Disciplina> disciplinas;
	private List<Livro> livros;
	private String nome;
	private String codigo;
	
	public static CursoBuilder reset() {
		return new CursoBuilder();
	}
	
	private CursoBuilder() {
		this.disciplinas = new ArrayList<Disciplina>();
		this.livros = new ArrayList<Livro>();	
	}
	
	
	public CursoBuilder addDisciplina(Disciplina disciplina){
		this.disciplinas.add(disciplina);		
		return this;
	}
	
	
	public CursoBuilder addLivro(Livro livro){		
		this.livros.add(livro);
		return this;
	}
	
	
	public CursoBuilder addNomeCurso(String nome) {
		this.nome = nome;
		return this;
	}
	
	
	public CursoBuilder addCodigoCurso(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public Curso build() {
		return new Curso(this.disciplinas, this.livros, this.nome, this.codigo);
	}

}
