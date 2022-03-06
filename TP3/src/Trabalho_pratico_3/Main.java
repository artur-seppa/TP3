package Trabalho_pratico_3;

import java.util.Scanner;

public class Main {  
	
	public static void menu() {
		System.out.print("\n\t\tSISTEMA DE VENDA DE ROUPAS E ACESSORIOS USADOS\n\n");
		System.out.print("|------------------------------------------------|\n");
		System.out.print("|    1. Cadastrar Novo Usuario                   |\n");
		System.out.print("|    2. Cadastrar Novo Item                      |\n");
		System.out.print("|    3. Cadastrar Nova Categoria                 |\n");
		System.out.print("|    4. Cadastrar Nova Promoção                  |\n");
		System.out.print("|    5. Imprimir Lista De Desejos                |\n");
		System.out.print("|    6. Imprimir Lista De Destaques              |\n");
		System.out.print("|    7. Imprimir Relacao Vendedor-Cliente        |\n");
		System.out.print("|    8. Publicar Novo Item                       |\n");
		System.out.print("|    0. Sair                                     |\n");
		System.out.print("|------------------------------------------------|\n");
		System.out.print("\nInsira a opção desejada: ");
	}
	
	public static void main(String[] args) {
		
		//====== logar usuario ======/
		Pessoa p2 = new Pessoa();
		p2.setNome("Raul");
		p2.setSexo("masc");
		p2.setCpf("043485");
		//===========================/
		int opcao;
		
		do {
			menu();
			Scanner ler = new Scanner(System.in);
			opcao = ler.nextInt();
			
		switch (opcao) {

		case 1:
			System.out.println("\n\t---- CADASTRAR VENDEDOR ----\n");
    		
    		System.out.println("Digite o seu nome:");
    		String input;
    		input = ler.next();
    		
				Endereco e1 = new Endereco();
				e1.setCep(71925000);
				e1.setBairro("Àguas Claras");
				e1.setCidade("Brasília");
				
				Telefone t1 = new Telefone();
				t1.setDdd(221);
				t1.setTelefone(8922);
				
				Pessoa p1 = new Pessoa();
				p1.setNome(input);
				p1.setSexo("masc");
				p1.setCpf("043485");
				
				//associa o objeto pessoa com telefone.
				p1.setTelefone(t1);
				//associa o objeto pessoa com endereco.
				p1.setEndereco(e1);
				
				System.out.println("o nome do usuario é : "+ p1.getNome());
				System.out.println("o telefone da pessoa é "+ p1.getTelefone().getTelefone());
				System.out.println("o endereco do usuario é " + p1.getEndereco().getBairro());
				System.out.println("o cep do usuario é " + p1.getEndereco().getCep());

			System.out.println("\nVendedor cadastrado com sucesso! ");
			break;

		case 2:
			System.out.println("\n\t---- CADASTRAR ITEM ----\n");

			System.out.println("Digite o seu item a ser cadastrado:");
    		input = ler.next();
    		
			VestuarioDeCima v1 = new VestuarioDeCima();
			v1.setCategoria("camiseta");
			v1.setQuantidadeEstoque(2);
			v1.setMarca("lost");
			
			VestuarioDeCima v2 = new VestuarioDeCima();
			v2.setMarca("blunt");
			
			//associa o nome da pessoa ao produto.
			v1.setPessoa(p2);
			v2.setPessoa(p2);
			
			//associa o produto a pessoa.
			p2.adicionarProduto(v1);
			p2.adicionarProduto(v2);
			
//			System.out.println("nome de quem ta vendendo: "+ v1.getPessoa().getNome());
//			System.out.println("categoria : "+ v1.getCategoria());
//			System.out.println("marca : "+ v1.getMarca());
			
			//lista a marca de produtos associados a pessoa
			for(int i=0; i<p2.quantidadeProdutos(); i++) {
				System.out.println(p2.getProduto(i).getMarca());
			}
			
			//excluir um produto associado do Usuario
			p2.excluirProduto(v2);
			System.out.println("testee");
			
			
			System.out.println("\nItem cadastrada com sucesso! ");
			break;

		case 3:
			System.out.println("\n\t---- CADASTRAR CATEGORIA ----\n");

			System.out.println("\nCategoria cadastrada com sucesso! ");
			break;

		case 4:
			System.out.println("\n\t---- CADASTRAR PROMOÇÃO ----\n");

			System.out.println("\nPromoção cadastrada com sucesso! ");
			break;

		case 5:
			System.out.println("\n\t----  LISTA DE DESEJOS ----\n");

			break;

		case 6:
			System.out.println("\n\t---- LISTA DE DESTAQUES ----\n");

			break;

		case 7:
			System.out.println("\n\t---- RELAÇÃO VENDEDOR E CLIENTE ----\n");

			break;

		case 8:
			System.out.println("\n\t---- PUBLICAR NOVO ITEM ----\n");

			System.out.println("\nItem publicado com sucesso! ");
			break;

		case 0:

			return;

		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		}while(opcao != 0);
	}

}
