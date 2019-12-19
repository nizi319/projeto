package empresaDeServico;

public class Curso {

	private String nome;
	private String descricao;
	private String [] nomesTreinadores;
	private String dataDeInicio;
	private String dataDoTermino;

	public Curso (String nome, String descricao, String dataDeInicio, String dataDoTermino) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataDeInicio = dataDeInicio;
		this.dataDoTermino = dataDoTermino;
		this.nomesTreinadores =  new String  [5];	

	}
	public void adicionarTreinadores(String nome) {

		for(int i= 0;i < nomesTreinadores.length; i++) {

			if(nomesTreinadores[i] == null) {

				nomesTreinadores[i] = nome;	
			}
		}
	}

	public void listarTreinadores() {

		for(int i= 0;i < nomesTreinadores.length; i++) {

			if(nomesTreinadores[i] != null) {
				System.out.println("treinadores");
				System.out.println(nomesTreinadores[i]);
			}
		}
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public String getDataDoTermino() {
		return dataDoTermino;
	}

	public void setDataDoTermino(String dataDoTermino) {
		this.dataDoTermino = dataDoTermino;
	}

}
