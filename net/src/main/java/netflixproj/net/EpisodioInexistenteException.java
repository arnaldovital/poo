package netflixproj.net;

public class EpisodioInexistenteException extends Exception {
	public EpisodioInexistenteException() {
		super("O episodio não foi encontrado");
	}
}
