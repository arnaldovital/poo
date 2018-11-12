package netflixproj.net;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity

public class Conteudo {
	@ID
	private String download_de_conteudo;
	private String variaçao_por_regiao;
	private ArrayList<Documentario>documentarios;
	private ArrayList<Series>series;
	private ArrayList<Filmes>filmes;
	public String getDownload_de_conteudo() {
		return download_de_conteudo;
	}
	public void setDownload_de_conteudo(String download_de_conteudo) {
		this.download_de_conteudo = download_de_conteudo;
	}
	public String getVariaçao_por_regiao() {
		return variaçao_por_regiao;
	}
	public void setVariaçao_por_regiao(String variaçao_por_regiao) {
		this.variaçao_por_regiao = variaçao_por_regiao;
	}
	public ArrayList<Documentario> getDocumentarios() {
		return documentarios;
	}
	public void setDocumentarios(ArrayList<Documentario> documentarios) {
		this.documentarios = documentarios;
	}
	public ArrayList<Series> getSeries() {
		return series;
	}
	public void setSeries(ArrayList<Series> series) {
		this.series = series;
	}
	public ArrayList<Filmes> getFilmes() {
		return filmes;
	}
	public void setFilmes(ArrayList<Filmes> filmes) {
		this.filmes = filmes;
	}
	@Override
	public String toString() {
		return "Conteudo [download_de_conteudo=" + download_de_conteudo + ", variaçao_por_regiao=" + variaçao_por_regiao
				+ ", documentarios=" + documentarios + ", series=" + series + ", filmes=" + filmes
				+ ", getDownload_de_conteudo()=" + getDownload_de_conteudo() + ", getVariaçao_por_regiao()="
				+ getVariaçao_por_regiao() + ", getDocumentarios()=" + getDocumentarios() + ", getSeries()="
				+ getSeries() + ", getFilmes()=" + getFilmes() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
