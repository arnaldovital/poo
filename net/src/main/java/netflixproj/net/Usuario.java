package netflixproj.net;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Identificavel {
	@Id
	@GeneratedValue
	private Long id_usuario;
	@OneToOne
	@JoinColumn(name = "conteudo_id")
	private Conteudo conteudo;
	@OneToOne
	@JoinColumn(name = "assinatura_id")
	private Assinatura assinatura;
	private String nome;
	
	

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public Assinatura getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(Assinatura assinatura) {
		this.assinatura = assinatura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public ArrayList<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(ArrayList<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	private String perfil;
	private ArrayList<Conteudo> conteudos;
	private Long id;

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", perfil=" + perfil + ", conteudos=" + conteudos
				+ ", getId_usuario()=" + getId_usuario() + ", getPerfil()=" + getPerfil() + ", getConteudos()="
				+ getConteudos() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;

	}
	
	

}
