package amazon;

public class Usuario {
	
	private int id;
	private static int numeroUsuarios = 0;
	private String nome;
	
	public Usuario() {
		setID(++numeroUsuarios);
		setNome("Convidado" + "000" + id);
	}
	
	public Usuario(String nome) {
		setID(++numeroUsuarios);
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(!nome.equals("")){
			this.nome = nome;
		}
		else{
			System.out.println("O nome não pode ser vazio.");
		}
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		if(id > 0){
			this.id = id;
		}
		else{
			System.out.println("O ID deve ser positivo.");
		}
	}
	
}