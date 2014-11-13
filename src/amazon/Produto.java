package amazon;

public abstract class Produto {
	
	protected Categoria categoria;
	protected String descricao;
	protected double preco;
        
    public Produto(String descricao, double preco){
		setDescricao(descricao);
		setPreco(preco);
        setCategoria(Categoria.OUT);
	}
	
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
        
    public abstract void mostrarInformacoes();
	
}