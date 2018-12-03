package netflixproj.net;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categorias")
public class Categorias  implements Identificavel{
	@Id
	private String melhores_filmes_avaliados;
	private String filmes_populares;
	private String genero;
	private String novos_filmes;
	@ManyToMany
    @JoinTable(name = "categorias_conteudo",
        joinColumns = @JoinColumn(name = "categorias_id"),
        inverseJoinColumns = @JoinColumn(name = "conteudo_id"))
	private ArrayList<Conteudo>conteudo;
	public String getMelhores_filmes_avaliados() {
		return melhores_filmes_avaliados;
	}
	public void setMelhores_filmes_avaliados(String melhores_filmes_avaliados) {
		this.melhores_filmes_avaliados = melhores_filmes_avaliados;
	}
	public String getFilmes_populares() {
		return filmes_populares;
	}
	public void setFilmes_populares(String filmes_populares) {
		this.filmes_populares = filmes_populares;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNovos_filmes() {
		return novos_filmes;
	}
	public void setNovos_filmes(String novos_filmes) {
		this.novos_filmes = novos_filmes;
	}
	public ArrayList<Conteudo> getConteudo() {
		return conteudo;
	}
	public void setConteudo(ArrayList<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public String toString() {
		return "Categorias [melhores_filmes_avaliados=" + melhores_filmes_avaliados + ", filmes_populares="
				+ filmes_populares + ", genero=" + genero + ", novos_filmes=" + novos_filmes + ", conteudo=" + conteudo
				+ ", getMelhores_filmes_avaliados()=" + getMelhores_filmes_avaliados() + ", getFilmes_populares()="
				+ getFilmes_populares() + ", getGenero()=" + getGenero() + ", getNovos_filmes()=" + getNovos_filmes()
				+ ", getConteudo()=" + getConteudo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
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
