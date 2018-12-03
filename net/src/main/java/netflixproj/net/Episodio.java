package netflixproj.net;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Episodio")
public class Episodio implements Identificavel{
	@Id
	private String elenco;
	private String duraçao;
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
		return "Episodio [elenco=" + elenco + ", duraçao=" + duraçao + ", getElenco()=" + getElenco()
				+ ", getDuraçao()=" + getDuraçao() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

}
