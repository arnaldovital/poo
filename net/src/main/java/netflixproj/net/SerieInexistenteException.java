package netflixproj.net;

public class SerieInexistenteException extends RuntimeException {
	public SerieInexistenteException() {
		super("A serie não foi encontrada");
	}
	
}
