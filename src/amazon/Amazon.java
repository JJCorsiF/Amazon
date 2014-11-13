package amazon;

import java.util.ArrayList;

public class Amazon {
	
	final private static String CNPJ = "30.245.907/0001-81";
	private static int quantidadeClientes = 0;
	private ArrayList<Conta> contas;
	private Conta contaLogada;
	private ArrayList<Produto> carrinho;
	
	public Amazon(){
		contas = new ArrayList<>();
		contaLogada = null;
	}
	
	public boolean isLogado(){
		if(contaLogada == null){
			return false;
		}
		return true;
	}

	public static String getCNPJ() {
		return CNPJ;
	}

	public static int getQuantidadeClientes() {
		return quantidadeClientes;
	}

	public static void setQuantidadeClientes(int quantidadeClientes) {
		if(quantidadeClientes > 0){
			Amazon.quantidadeClientes = quantidadeClientes;
		}
		else{
			System.out.println("Erro: A quantidade de clientes deve ser positiva.");
		}
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public Conta getContaLogada() {
		return contaLogada;
	}

	public void setContaLogada(Conta contaLogada) {
		if(!isLogado()){
			this.contaLogada = contaLogada;
		}
	}

	public ArrayList<Produto> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}
	
	public void mostrarCarrinho(){
		if (!carrinho.isEmpty()){
			System.out.println("Produtos no carrinho:\n"
							+ "Nº \t Produto \t Preço");
			int i = 0;
			double total = 0;
			for(Produto produto : carrinho){
				i++;
				System.out.println(i + "\t" + produto.descricao + "\t" + produto.preco);
				total += produto.preco;
			}
			System.out.println("Total: \t\t\t " + total);
		}
		else{
			System.out.println("O carrinho está vazio.");
		}
	}
	
	public void login(String login, String senha){
		for(Conta conta : contas){
			if(conta.getLogin() == login){
				if(conta.getSenha() == senha){
					conta.setAutenticado(true);
					contaLogada = conta;
                    System.out.println("Logado como " + contaLogada.getUsuario().getNome() + ".");
					break;
				}
				else{
					System.out.println("Falha na autenticação: senha incorreta.");
				}
			}
		}
	}
	
	public void logout(){
		if(contaLogada != null){
			contaLogada.setAutenticado(false);
			contaLogada = null;
		}
	}

	public static void main(String[] args) {
		Amazon loja = new Amazon();
        System.out.println("Loja Amazon. CNPJ " + Amazon.CNPJ + ".");
        DVD dvd = new DVD(Categoria.FIC, "J.R.R. Tolkien", "The Lord of the Rings: The Return of the King", 60.0);
        Livro livro = new Livro(Categoria.FIC, "J.K. Rowling", "Harry Potter and the Deathly Hallows", 45.0);
        Conta user1 = new Conta("Usuario", "login1", "senha1");
        loja.contas.add(user1);
        loja.carrinho.add(dvd);
        loja.carrinho.add(livro);
        setQuantidadeClientes(loja.contas.size());
        loja.mostrarCarrinho();
        livro.mostrarInformacoes();
        dvd.mostrarInformacoes();
        loja.login("login1", "senha1");
	}
	
}