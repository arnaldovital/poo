package netflixproj.net;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Series")
public class Series implements Identificavel {
	@Id
	private Long id;
	private String ano;
	@ManyToMany
	@JoinTable(name = "series_temporada", joinColumns = @JoinColumn(name = "series_id"), inverseJoinColumns = @JoinColumn(name = "temporada_id"))
	private ArrayList<Temporada> temporadas;
	private String nome;

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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
