package amazon;

public class DVD extends Produto {
	
	private String tipo;
    
    public DVD(String descricao, double preco){
    	super(descricao, preco);
		setTipo("Filme");
	    setCategoria(Categoria.OUT);
	}
    
    public DVD(String tipo, String descricao, double preco){
    	super(descricao, preco);
		setTipo(tipo);
        setCategoria(Categoria.OUT);
    }
	
	public DVD(Categoria categoria, String tipo, String descricao, double preco){
		super(categoria, descricao, preco);
		setTipo(tipo);
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
    @override
    public String getDescricao() {
		return "DVD " + descricao;
	}
    
    public void mostrarInformacoes(){
        System.out.println("Descrição: " + getDescricao()
                + "\nCategoria: " + getCategoria()
                + "\nTipo: " + getTipo()
                + "\nPreço: " + getPreco());
    }
    
}