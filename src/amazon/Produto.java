package amazon;

public class Produto {
	
	protected Categoria categoria;
	protected String descricao;
	protected double preco;
	
	public Produto(Categoria categoria, String descricao, double preco){
		setCategoria(categoria);
		setDescricao(descricao);
		setPreco(preco);
	}
	
	public Categoria getCategoria(){
		return categoria;
	}
	
	public void setCategoria(Categoria categoria){
		this.categoria = categoria;
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