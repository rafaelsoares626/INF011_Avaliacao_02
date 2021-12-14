package Model;

import java.util.ArrayList;
import java.util.List;

public class EmentaBuilder {
	
	private List<Disciplina> disciplinas;
	private List<Livro> livros;
	private String nome;
	private String codigo;
	
	public static EmentaBuilder reset() {
		return new EmentaBuilder();
	}
	
	private EmentaBuilder() {
		this.disciplinas = new ArrayList<Disciplina>();
		this.livros = new ArrayList<Livro>();	
	}
	
	
	public EmentaBuilder addDisciplina(Disciplina disciplina){
		this.disciplinas.add(disciplina);		
		return this;
	}
	
	
	public EmentaBuilder addLivro(Livro livro){		
		this.livros.add(livro);
		return this;
	}
	
	
	public EmentaBuilder addNomeCurso(String nome) {
		this.nome = nome;
		return this;
	}
	
	
	public EmentaBuilder addCodigoCurso(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public Ementa build() {
		return new Ementa(this.disciplinas, this.livros, this.nome, this.codigo);
	}

}

