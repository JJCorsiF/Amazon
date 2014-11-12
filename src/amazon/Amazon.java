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
							+ "N� \t Produto \t Pre�o");
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
			System.out.println("O carrinho est� vazio.");
		}
	}

	public static void main(String[] args) {
		//Requisitos que faltam:
		//sobreescrita de m�todo (chamar dentro do m�todo da classe) - usar o @override
		//Diagrama de classes no astah e arquivo .png
		//M�todo static a ser chamado no main
		//Usar todas as classes no main
	}
	
}