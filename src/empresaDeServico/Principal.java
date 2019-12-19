package empresaDeServico;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;

		Instrutor instrutor= new Instrutor("José","51263287");

		String nome;
		String descricao;
		String dataDeInicio;
		String dataDoTermino;
		String local;
		String endereco;
		String telefone;
		String email;
		Curso curso;	
		Evento evento;
		String novoNomeDoEvento;
		String novoNomeDoCurso;

		do {

			System.out.println("********Bem vindo ao menu*********");
			System.out.println("******\n******");
			System.out.println("*******Curso*******");
			System.out.println("****Opção 1:Adicionar Curso ****");
			System.out.println("****Opção 2:Atualizar Curso ****");
			System.out.println("****Opção 3:Deletar Curso ****");
			System.out.println("****Opção 4: Buscar Cursos****");
			System.out.println("****Opção 5:Listar curso");
			System.out.println("******\n******");
			System.out.println("********Evento******");
			System.out.println("****Opção 6: Adicianar Eventos ****");
			System.out.println("****Opção 7: Atualizar Eventos ****");
			System.out.println("****Opção 8: Deletar Eventos ****");
			System.out.println("****Opção 9:Buscar Eventos****");
			System.out.println("****Opção 10: listar Eventos****");
			System.out.println("****Opção 11: finalizar****");
			System.out.println("********\n*******");

			System.out.println("Digite uma opção");
			opcao = scanner.nextInt();


			switch (opcao) {


			case  1:
				scanner.nextLine();
				System.out.println("Adicionar Cursos");
				System.out.println("Digite o nome do curso");
				nome = scanner.nextLine();

				System.out.println("Digite a descrição do curso");
				descricao = scanner.nextLine();
				System.out.println("Digite a data de inicio do curso");
				dataDeInicio = scanner.nextLine();
				System.out.println("Digite a data de termino do curso");
				dataDoTermino = scanner.nextLine();
				curso= new Curso(nome, descricao, dataDeInicio, dataDoTermino);
				instrutor.adicionarCurso(curso);
				break;


			case 2:
				scanner.nextLine();
				System.out.println("Digite o nome do curso");
				nome = scanner.nextLine();

				System.out.println("Digite o novo nome de curso");
				novoNomeDoCurso = scanner.nextLine();
				System.out.println("Digite a data de inicio do curso");
				dataDeInicio = scanner.nextLine();
				System.out.println("Digite a data de termino do curso");
				dataDoTermino = scanner.nextLine();
				System.out.println("Digite a descrição do curso");
				descricao = scanner.nextLine();

				instrutor.atualizarcurso(nome, novoNomeDoCurso, dataDeInicio, dataDoTermino, descricao);

				break;

			case 3:

				scanner.nextLine();
				System.out.println("Deletar Cursos");
				System.out.println("Digite o nome do curso");
				nome = scanner.nextLine();
				instrutor.deletarCursos(nome);

				break;

			case 4:
				scanner.nextLine();
				System.out.println("Digite o nome do curso");
				nome = scanner.nextLine();

				instrutor.buscarCursos(nome);

				break;

			case 5:

				instrutor.listarcursos();

				break;

			case 6:

				scanner.nextLine();
				System.out.println("Adicionar Eventos");
				System.out.println("Digite o nome do evento");
				nome = scanner.nextLine();

				System.out.println("Digite a data de inicio");
				dataDeInicio = scanner.nextLine();
				System.out.println("Digite a data do termino do evento");
				dataDoTermino = scanner.nextLine();
				System.out.println("Digite o local do evento");
				local = scanner.nextLine();
				System.out.println("Digite o endereço do evento");
				endereco= scanner.nextLine();
				System.out.println("Inforne o seu telefone");
				telefone = scanner.nextLine();
				System.out.println("Informe seu email");
				email = scanner.nextLine();

				evento= new Evento (nome, dataDeInicio, dataDoTermino, local, endereco, telefone, email);
				instrutor.adicionarEvento(evento);

				break;

			case 7:


				scanner.nextLine();
				System.out.println("Digite o nome do evento");
				nome = scanner.nextLine();

				System.out.println("Digite o novo nome de evento");
				novoNomeDoEvento = scanner.nextLine();
				System.out.println("Digite a data de inicio do evento");
				dataDeInicio = scanner.nextLine();
				System.out.println("Digite a data de termino do evento");
				dataDoTermino = scanner.nextLine();
				System.out.println("Digite o local do evento ");
				local = scanner.nextLine();
				System.out.println("Digite o endereço do evento ");
				endereco = scanner.nextLine();
				System.out.println("inforeme o seu telefone");
				telefone = scanner.nextLine();
				System.out.println("Informe o seu email");
				email = scanner.nextLine();

				instrutor.atualizarEventos(nome, novoNomeDoEvento, dataDeInicio, dataDoTermino,local,endereco,telefone,email );

				break;

			case 8:

				scanner.nextLine();
				System.out.println("Deletar eventos");
				System.out.println("Digite o nome do eventos");
				nome = scanner.nextLine();
				instrutor.deletarEventos(nome);	

				break;

			case 9:
				scanner.nextLine();
				System.out.println("Digite o nome do eventos");
				nome = scanner.nextLine();
				instrutor.buscarEventos (nome);
				break;

			case 10:
				instrutor.listareventos();
				break;
				
			case 11:
				break;
				
			default:
				System.out.println("Opção Incorreta!");
				
			}

		}

		while(opcao != 11);
	}

}