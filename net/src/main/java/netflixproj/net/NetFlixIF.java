package netflixproj.net;

import java.util.ArrayList;

public interface NetFlixIF {
	public Filmes addFilmes(String nome, String ano, String elenco, String duraçao) throws NomeInvalidoException;
	public Filmes removerFilmes(String nome, String ano, String elenco, String duraçao) throws NomeInvalidoException;
	
	public Series addSeries(String nome,String ano,ArrayList<Temporada>temporadas) throws NomeInvalidoException;
	public Series removerSeries(String nome,String ano,ArrayList<Temporada>temporadas) throws NomeInvalidoException;
	
	public Episodio addEpisodio(String nome,String ano,ArrayList<Temporada>temporadas) throws NomeInvalidoException;
	public Episodio removerEpisodio(String nome,String ano,ArrayList<Temporada>temporadas) throws NomeInvalidoException;
	

}

