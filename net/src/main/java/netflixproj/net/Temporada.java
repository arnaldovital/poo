package netflixproj.net;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Temporada")
public class Temporada implements Identificavel{
	@Id
	private String lançamento;
	private int quant_episodios;
	public String getLançamento() {
		return lançamento;
	}
	public void setLançamento(String lançamento) {
		this.lançamento = lançamento;
	}
	public int getQuant_episodios() {
		return quant_episodios;
	}
	public void setQuant_episodios(int quant_episodios) {
		this.quant_episodios = quant_episodios;
	}
	@Override
	public String toString() {
		return "Temporada [lançamento=" + lançamento + ", quant_episodios=" + quant_episodios + ", getLançamento()="
				+ getLançamento() + ", getQuant_episodios()=" + getQuant_episodios() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
