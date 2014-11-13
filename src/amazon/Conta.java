package amazon;

public class Conta {
	
	private Usuario usuario;
	private String login;
	private String senha;
	private boolean autenticado;
	
	public Conta(){
		setUsuario(new Usuario());
		setLogin("Convidado" + "000" + usuario.getID());
		setSenha("123456");
		setAutenticado(false);
	}
	
	public Conta(String login, String senha){
		setUsuario(new Usuario());
		setLogin(login);
		setSenha(senha);
		setAutenticado(false);
	}
	
	public Conta(String nome, String login, String senha){
		setUsuario(new Usuario(nome));
		setLogin(login);
		setSenha(senha);
		setAutenticado(false);
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		if(isAutenticado()){
			if((login.length() > 5 && login.length() < 21)){
				this.login = login;
			}
			else{
				System.out.println("O login deve ter no mínimo 6 e no máximo 20 caracteres.");
			}
		}
		else{
			System.out.println("Você deve estar logado para isso!");
		}
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		if(isAutenticado()){
			if(senha.length() > 5 && senha.length() < 16){
				this.senha = senha;
			}
			else{
				System.out.println("A senha deve ter no mínimo 6 e no máximo 15 caracteres.");
			}
		}
		else{
			System.out.println("Você deve estar logado para isso!");
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario user) {
		this.usuario = user;
	}
	
	public boolean isAutenticado() {
		return autenticado;
	}

	public void setAutenticado(boolean autenticado) {
		this.autenticado = autenticado;
	}
	
}