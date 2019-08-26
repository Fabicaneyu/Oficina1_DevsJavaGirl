package br.com.projetooficial.dominio;

public class UsuarioOficial {
	
	private String usuarioCodigo;
	private String usuarioNome;
	private String dataNascimento;
	private String endereco;
	public String getUsuarioCodigo() {
		return usuarioCodigo;
	}
	public void setUsuarioCodigo(String usuarioCodigo) {
		this.usuarioCodigo = usuarioCodigo;
	}
	public String getUsuarioNome() {
		return usuarioNome;
	}
	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public UsuarioOficial(String usuarioCodigo, String usuarioNome, String dataNascimento, String endereco) {
		super();
		this.usuarioCodigo = usuarioCodigo;
		this.usuarioNome = usuarioNome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}
	
	public void imprimeUsuario() {
		System.out.println("Código Usuário: " + usuarioCodigo);
		System.out.println("Nome Completo: " + usuarioNome);
		System.out.println("Data de nascimento: " + dataNascimento);
		System.out.println("Endereço: " + endereco);
		
	}


}
