package amazon;

public class DVD extends Produto {
	
	private String tipo;
	
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
	
}