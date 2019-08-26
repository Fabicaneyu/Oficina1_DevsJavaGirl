package br.com.projetooficial.dominio;

public class LivroOficial {
	private String livroCodigo;
	private String livroNome;
	private String livroAutor;
	
	public String getLivroCodigo() {
		return livroCodigo;
	}

	public void setLivroCodigo(String livroCodigo) {
		this.livroCodigo = livroCodigo;
	}

	public String getLivroNome() {
		return livroNome;
	}

	public void setLivroNome(String livroNome) {
		this.livroNome = livroNome;
	}

	public String getLivroAutor() {
		return livroAutor;
	}

	public void setLivroAutor(String livroAutor) {
		this.livroAutor = livroAutor;
	}

	public LivroOficial(String livroCodigo, String livroNome, String livroAutor) {
		super();
		this.livroCodigo = livroCodigo;
		this.livroNome = livroNome;
		this.livroAutor = livroAutor;
	}

	public void imprimeLivro () {
		System.out.println("Código: " + livroCodigo);
		System.out.println("Nome: " + livroNome);
		System.out.println("Autor: " + livroAutor); 
	}
	
	
}