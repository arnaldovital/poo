package netflixproj.net;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity

public class Usuario {
	@ID
	
	private int id_usuario;
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
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
	private ArrayList<Conteudo>conteudos;
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", perfil=" + perfil + ", conteudos=" + conteudos
				+ ", getId_usuario()=" + getId_usuario() + ", getPerfil()=" + getPerfil() + ", getConteudos()="
				+ getConteudos() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
