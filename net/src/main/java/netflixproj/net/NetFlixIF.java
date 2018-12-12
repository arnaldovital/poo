package netflixproj.net;


public interface NetFlixIF {

	public Filmes addFilmes(Filmes f) throws FilmeNuloException;

	public Filmes removerFilmes(Long id) throws IdNuloException, FilmeInexistenteException;

	public Series addSeries(Series s) throws IdNuloException, EpisodioInexistenteException;

	public Series removerSeries(Long id) throws IdNuloException, SerieInexistenteException;

	public Episodio addEpisodio(Episodio ep) throws IdNuloException, EpisodioInexistenteException;

	public Episodio removerEpisodio(Long id) throws IdNuloException, EpisodioInexistenteException;

}
