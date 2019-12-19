package empresaDeServico;

public class Instrutor {

	private String nome;
	private String cpf;
	private Curso[] cursos;
	private Evento[] eventos;


	public Instrutor(String nome, String cpf) {

		this.nome = nome;
		this.cpf = cpf;

		this.cursos = new Curso[5];
		this.eventos = new Evento[5];



	}

	public void adicionarCurso(Curso curso) {

		for(int i= 0;i < cursos.length; i++) {
			if(cursos[i] == null) {
				cursos[i] = curso;		
				
				System.out.println("Curso " + curso.getNome() + "  deletado!");
				break;
			}	
		}


	}

	public void listarcursos() {

		for(int i= 0;i < cursos.length; i++) {

			if(cursos[i] != null) {
				System.out.println("nome do curso: " + cursos[i].getNome());
				System.out.println("descrição do curso:" + cursos[i].getDescricao());
				System.out.println("dataDeInicio:" + cursos[i].getDataDeInicio());
				System.out.println("dataDoTermino:" + cursos[i].getDataDoTermino());

				cursos[i].listarTreinadores();
			}
		}
	}

	public void adicionarEvento (Evento evento) {

		for(int i= 0;i < eventos.length; i++) {
			if(eventos[i] == null) {
				eventos[i] = evento;
				
				System.out.println("Evento " + evento.getNome() + " cadastrado!");
				break;
			}		}
	}

	public void listareventos() {

		for(int i= 0;i < eventos.length; i++) {
			if(eventos[i] != null) {
				System.out.println("nome do evento: " + eventos[i].getNome());
				System.out.println("data do inicio:" + eventos[i].getDataDeInicio());
				System.out.println("data de termino:" + eventos[i].getDataDoTermino());
				System.out.println("local:" +eventos[i].getLocal());
				System.out.println("endereco:" +eventos[i].getEndereco());
				System.out.println("telefone:" +eventos[i].getTelefone());
				System.out.println("email:" +eventos[i].getEmail());

			}	


		}


	}
	public void deletarEventos (String nome ) {

		for(int i= 0;i < eventos.length; i++) {
			if(eventos[i] != null && eventos[i].getNome().equalsIgnoreCase(nome)) {	

				eventos[i] = null;	

				System.out.println("Evento " + eventos[i].getNome() + " deletado!");
				break;

			}
		}

	}

	public void deletarCursos (String nome ) {

		for(int i= 0;i < cursos.length; i++) {
			if(cursos[i] != null && cursos[i].getNome().equalsIgnoreCase(nome)) {	

				System.out.println("Curso " + cursos[i].getNome() + "  deletado!");
				cursos[i] = null;	
				
				break;

			}

		}

	}
	public void buscarCursos (String nome ) {

		for(int i= 0;i < cursos.length; i++) {
			if(cursos[i] != null && cursos[i].getNome().equalsIgnoreCase(nome)) {	
				System.out.println("curso entrado:");
				System.out.println("descrição do curso:" + cursos[i].getDescricao());
				System.out.println("dataDeInicio:" + cursos[i].getDataDeInicio());
				System.out.println("dataDoTermino:" + cursos[i].getDataDoTermino());

				cursos[i].listarTreinadores();

				break;

			}
		}

	}
	public void buscarEventos (String nome ) {

		for(int i= 0;i < eventos.length; i++) {
			if(cursos[i] != null && cursos[i].getNome().equalsIgnoreCase(nome)) {	
				System.out.println("evento encontrado:");
				System.out.println("nome do evento:" + eventos[i].getNome());
				System.out.println("dataDeInicio:" + eventos[i].getDataDeInicio());
				System.out.println("dataDoTermino:" + eventos[i].getDataDoTermino());

				cursos[i].listarTreinadores();

				break;

			}	

		}


	}


	public boolean atualizarEventos (String nome, String novoNome, String dataInicio, String dataDeTermino, String local, String endereco, String telefone, String email ) {

		for(int i= 0;i < eventos.length; i++) {
			if(eventos[i] != null && eventos[i].getNome().equalsIgnoreCase(nome)) {	

				eventos[i].setNome(novoNome);
				eventos[i].setDataDeInicio(dataInicio);
				eventos[i].setDataDoTermino(dataDeTermino);
				eventos[i].setLocal(local);
				eventos[i].setEndereco(endereco);
				eventos[i].setTelefone(telefone);
				eventos[i].setEmail(email);

				System.out.println("Evento " + eventos[i].getNome() + " atualizado!");
				return true;

			}	

		}
		return false;

	}
	public boolean atualizarcurso (String nome, String novoNome, String dataDeInicio, String dataDoTermino, String descricao ) {

		for(int i= 0;i < cursos.length; i++) {

			System.out.println("descrição do curso:" + cursos[i].getNome());
			System.out.println("dataDeInicio:" + cursos[i].getDataDeInicio());
			System.out.println("dataDoTermino:" + cursos[i].getDataDoTermino());

			if(cursos[i] != null && cursos[i].getNome().equals(nome)) {	
				System.out.println(cursos[i].getDataDeInicio());
				cursos[i].setNome(novoNome);
				cursos[i].setDataDeInicio(dataDeInicio);
				cursos[i].setDataDoTermino(dataDoTermino);
				cursos[i].setDescricao(descricao);

				System.out.println("Curso " + cursos[i].getNome() + " atualizado!");
				return true ;

			}	
		}

		return false;	
	}



}


