package netflixproj.net;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Filmes")
public class Filmes {
	@ID
	@OneToOne
    @JoinColumn(name = "filmes_id")
	private String nome;
	private String ano;
	private String elenco;
	private String duraçao;
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

}
