package Model;

public enum TipoProduto {

	LIVRO("Model.LivroFactory"),
	DISCIPLINA("Model.DisciplinaFactory");
	
	String className;
	
	private TipoProduto(String className) {
		this.className = className;
	}
	
	public String getFactoryName() {
		return this.className;
	}
	
}



