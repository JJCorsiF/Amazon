package amazon;

public class Produto {
	
	protected String descricao;
	protected double preco;
	
	public Produto(String descricao, double preco){
		setDescricao(descricao);
		setPreco(preco);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}