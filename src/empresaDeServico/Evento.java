package empresaDeServico;

public class Evento {

	private String nome;
	private String dataDeInicio;
	private String dataDoTermino;
	private String local;
	private String endereco;
	private String telefone;
	private String email;

	public  Evento(String nome, String dataDeInicio, String dataDoTermino, String local, String endereco, String telefone, String email) {
		this.nome = nome;
		this.dataDeInicio = dataDeInicio;
		this.dataDoTermino = dataDoTermino;
		this.local = local;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;


	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}




}
