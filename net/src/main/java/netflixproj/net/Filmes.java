package netflixproj.net;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Filmes")
public class Filmes implements Identificavel {
	@Id
	@OneToOne
	@JoinColumn(name = "filmes_id")
	private Long id;
	private String ano;
	private String elenco;
	private String duraçao;
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

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getDuraçao() {
		return duraçao;
	}

	public void setDuraçao(String duraçao) {
		this.duraçao = duraçao;
	}

	@Override
	public String toString() {
		return "Filmes [nome=" + nome + ", ano=" + ano + ", elenco=" + elenco + ", duraçao=" + duraçao + ", getNome()="
				+ getNome() + ", getAno()=" + getAno() + ", getElenco()=" + getElenco() + ", getDuraçao()="
				+ getDuraçao() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((duraçao == null) ? 0 : duraçao.hashCode());
		result = prime * result + ((elenco == null) ? 0 : elenco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filmes other = (Filmes) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (duraçao == null) {
			if (other.duraçao != null)
				return false;
		} else if (!duraçao.equals(other.duraçao))
			return false;
		if (elenco == null) {
			if (other.elenco != null)
				return false;
		} else if (!elenco.equals(other.elenco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
