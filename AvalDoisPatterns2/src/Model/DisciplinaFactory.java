package Model;

public class DisciplinaFactory extends ProdutoFactory{

	public DisciplinaFactory(String nome, String codigo) {
		super(nome, codigo);
	}
	
	public DisciplinaFactory() {
		super();
	}
	
	public Produto createProduto() {
		return new Disciplina(this.nome, this.codigo, 50, 60, 0);
	}

}
