package br.com.projetooficial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.projetooficial.dominio.EmprestimoOficial;
import br.com.projetooficial.dominio.LivroOficial;
import br.com.projetooficial.dominio.UsuarioOficial;


public class TestePrograma {
	public static void main(String[] args) {
		System.out.println("Seus Dados");

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Qual seu código da faculdade:    ");
		String carteirinha = scanner.nextLine();
		
		System.out.println("Qual seu nome?       ");
		String usuarioNome = scanner.nextLine();
		
		System.out.println("Qual sua data de nascimento? ");
		String data = scanner.nextLine();
		
		System.out.println("Qual seu endereço? ");
		String bairro = scanner.nextLine();
		
		UsuarioOficial usuario1 = new UsuarioOficial (carteirinha, usuarioNome, data, bairro);
		
		
		System.out.println("===================================================");
		
		System.out.println("Sistema Biblioteca");
		
		System.out.println("Qual código do livro: ");
		String numero = scanner.nextLine();
		
		System.out.println("Nome do livro: ");
		String livroNome = scanner.nextLine();
		
		System.out.println("Autor: ");
		String nomeAutor = scanner.nextLine();
		
		LivroOficial livro1 = new LivroOficial (numero, livroNome, nomeAutor);
		
		System.out.println("Qual a data de hoje: ");
		String dataHoje = scanner.nextLine();
		LocalDate dataEmprestimo = LocalDate.parse(dataHoje, DateTimeFormatter.ISO_DATE);
		LocalDate dataDevolucao = dataEmprestimo.plusDays(7);
		
		scanner.close();
		
		System.out.println("===================================================");
		System.out.println("Recibo da Biblioteca");
		
		EmprestimoOficial emprestimo1 = new EmprestimoOficial (numero, usuario1, livro1, dataEmprestimo, dataDevolucao);
				
		emprestimo1.imprimeEmprestimo();		
				
	}
}