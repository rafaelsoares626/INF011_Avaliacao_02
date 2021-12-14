package Model;

public abstract class Produto {
	
	protected String nome;
	protected String codigo;	
		
	public Produto(String nome, String codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;		
	}
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	protected void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void nomeProduto(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	protected abstract double getPreco();
	
}
