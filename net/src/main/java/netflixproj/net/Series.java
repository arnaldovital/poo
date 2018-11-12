package netflixproj.net;

import java.util.ArrayList;

import javax.persistence.Entity;
@Entity

public class Series {
	@ID
	private String nome;
	private String ano;
	private ArrayList<Temporada>temporadas;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	@Override
	public String toString() {
		return "Series [nome=" + nome + ", ano=" + ano + ", temporadas=" + temporadas + ", getNome()=" + getNome()
				+ ", getAno()=" + getAno() + ", getTemporadas()=" + getTemporadas() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
