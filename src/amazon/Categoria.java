package amazon;

public enum Categoria {
	MUS("Musical"),
	ROM("Romance"),
	COM("Com�dia"),
	FIC("Fic��o"),
	AVE("Aventura"),
	SUS("Suspense"),
	ACA("A��o"),
	OUT("Outros");
	
	private final String nome;
	
	Categoria(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
}