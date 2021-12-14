package Model;

public class Disciplina extends Produto implements PrototipavelIF{
	
	private double chTotal;
	private double pctCumprido;
	private double preco;
		
	public Disciplina(String nome, String codigo, double preco, double chTotal, double pctCumprido) {
		super(nome, codigo);
		this.setPreco(preco);
		this.setChTotal(chTotal);
		this.setPctCumprido(pctCumprido);
	}
	
	public Disciplina(Disciplina disciplina) {
		super(disciplina.getNome(), disciplina.getCodigo());
		this.setPreco(disciplina.getPreco());
		this.setChTotal(disciplina.getChTotal());
		this.setPctCumprido(disciplina.getPctCumprido());
	}
	
	public double getPctCumprido() {		
		return pctCumprido;
	} 

	public void setPctCumprido(double pctCumprido) {		
		this.pctCumprido = validarPctCumprido(pctCumprido);
	}
	
	private double validarPctCumprido(double pctCumprido) {
		if(pctCumprido > 1) {
			return this.pctCumprido = 1;
		}else if (pctCumprido < 0) {
			return this.pctCumprido = 0;
		}else{
			return this.pctCumprido = pctCumprido;
		}		
	}

	public double getChTotal() {
		return chTotal;
	}

	private void setChTotal(double chTotal) {
		this.chTotal = chTotal;
	}

	public double getPreco() {
		return preco;
	}
	
	private void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "\n - nomeDisciplina => " + nome 
				//+ " |codigoDisciplina => " + codigo
				//+ " |chTotal => " + chTotal 
				+ " |pctCumprido => " + getPctCumprido() * 100 + "%";
				//+ " |precoDisciplina => " + preco;				
	}
	
	@Override
	public PrototipavelIF prototipar() {
		return new Disciplina(this);
	}
}
