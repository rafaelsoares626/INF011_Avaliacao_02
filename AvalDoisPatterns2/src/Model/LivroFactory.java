package Model;

public class LivroFactory extends ProdutoFactory {
	
	public LivroFactory(String nome, String codigo) {
		super(nome, codigo);
	}
	
	public LivroFactory() {
		super();
	}
	
	public Produto createProduto() {
		return new Livro(this.nome, this.codigo, 70, "ISBN");
	}
}
