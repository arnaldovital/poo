package netflixproj.net;

public class NomeInvalidoException extends RuntimeException {
	public NomeInvalidoException() {
		super("O nome inválido");
	}
	
}
