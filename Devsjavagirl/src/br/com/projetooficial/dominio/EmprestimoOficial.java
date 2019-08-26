package br.com.projetooficial.dominio;

import java.time.LocalDate;

public class EmprestimoOficial {

	private String codigoSolicitacao;
	private UsuarioOficial usuarioNome;
	private LivroOficial livroNome;
	private LocalDate dataSolicitacao;
	private LocalDate dataDevolucao;
	
	public String getCodigoSolicitacao() {
		return codigoSolicitacao;
	}
	public void setCodigoSolicitacao(String codigoSolicitacao) {
		this.codigoSolicitacao = codigoSolicitacao;
	}
	public UsuarioOficial getUsuarioNome() {
		return usuarioNome;
	}
	public void setUsuarioNome(UsuarioOficial usuarioNome) {
		this.usuarioNome = usuarioNome;
	}
	public LivroOficial getLivroNome() {
		return livroNome;
	}
	public void setLivroNome(LivroOficial livroNome) {
		this.livroNome = livroNome;
	}
	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public EmprestimoOficial(String codigoSolicitacao, UsuarioOficial usuarioNome, LivroOficial livroNome,
			LocalDate dataSolicitacao, LocalDate dataDevolucao) {
		super();
		this.codigoSolicitacao = codigoSolicitacao;
		this.usuarioNome = usuarioNome;
		this.livroNome = livroNome;
		this.dataSolicitacao = dataSolicitacao;
		this.dataDevolucao = dataDevolucao;
	}
	
	public void imprimeEmprestimo () {
		
		System.out.println("Código da solicitação: " + codigoSolicitacao );
		System.out.println("Usuario Solicitante: " + usuarioNome.getUsuarioNome());
		System.out.println("Livro emprestado: " + livroNome.getLivroNome());
		System.out.println("Data da solicitação: " + dataSolicitacao);
		System.out.println("Data da devolução: " + dataDevolucao);
	}
	
	
}
