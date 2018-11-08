package model;

public class Filme {
	private String titulo;
	private String diretor;
	private String duracao;
	private String elenco;
	private String genero;
	private String produtora;
	private String classificacao;
	private String descricao;
	
	public Filme()
	{
		
	}
	
	public Filme(String titulo, String diretor, String duracao, String elenco, String genero, String produtora, String classificacao, String descricao)
	{
		this.titulo = titulo;
		this.diretor = diretor;
		this.duracao = duracao;
		this.elenco = elenco;
		this.genero = genero;
		this.produtora = produtora;
		this.classificacao = classificacao;
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
