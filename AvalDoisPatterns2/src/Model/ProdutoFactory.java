package Model;

public abstract class ProdutoFactory {

		protected String nome;
		protected String codigo;
		
		public ProdutoFactory() {
			this.nome = null;
			this.nome = null;
		}		
		
		public ProdutoFactory(String nome, String codigo) {
			this.nome = nome;
			this.codigo = codigo;
		}
	
		public abstract Produto createProduto();
		
		public Produto getProduto(String nome, String codigo) {
			Produto produto = this.createProduto();
			produto.nomeProduto(nome, codigo);
			return produto;
		}
}
