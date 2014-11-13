package amazon;

public class Livro extends Produto {
    	
        private String autor;
        
        public Livro(String autor, String descricao, double preco){
			super(descricao, preco);
	        setAutor(autor);
	        setCategoria(Categoria.OUT);
		}
        
		public Livro(Categoria categoria, String autor, String descricao, double preco){
			super(categoria, descricao, preco);
			setAutor(autor);
	        setCategoria(Categoria.OUT);
		}
		
        @override
        public String getDescricao() {
			return "Livro " + descricao;
		}
        
        public String getAutor(){
            return this.autor;
        }
        
        public void setAutor(String autor){
            this.autor = autor;
        }
        
        public void mostrarInformacoes(){
            System.out.println("Descrição: " + getDescricao()
                    + "\nCategoria: " + getCategoria()
                    + "\nAutor: " + getAutor()
                    + "\nPreço: " + getPreco());
        }
        
}