package netflixproj.net;


public class NetFlix implements NetFlixIF {


	public Series addSeries(Series s) throws SerieInexistenteException {
		if (s == null) {
			throw new SerieInexistenteException();
		}
		DAO<Series> dao = new DAO<Series>();
		dao.save(s);
		return dao.find(Series.class, s.getId());
	}

	public Series removerSeries(Long id) throws IdNuloException, SerieInexistenteException {
		DAO<Series> dao = new DAO<Series>();
		if (id == null) {
			throw new IdNuloException();
		} else if (dao.find(Series.class, id) == null) {
			throw new SerieInexistenteException();
		} else {
			Series s = dao.find(Series.class, id);
			dao.remove(s);
			return s;
		}
	}

	public Episodio addEpisodio(Episodio e) throws EpisodioInexistenteException {
		if (e == null) {
			throw new EpisodioInexistenteException();
		}
		DAO<Episodio> dao = new DAO<Episodio>();
		dao.save(e);
		return dao.find(Episodio.class, e.getId());
	}

	

	public Episodio removerEpisodio(Long id) throws IdNuloException, EpisodioInexistenteException {
		DAO<Episodio> dao = new DAO<Episodio>();
		if (id == null) {
			throw new IdNuloException();
		} else if (dao.find(Episodio.class, id) == null) {
			throw new EpisodioInexistenteException();
		} else {
			Episodio e = dao.find(Episodio.class, id);
			dao.remove(e);
			return e;
	}
	}

	public Filmes addFilmes(Filmes f) throws FilmeNuloException {
		if (f == null) {
			throw new FilmeNuloException();
		}
		DAO<Filmes> dao = new DAO<Filmes>();
		dao.save(f);
		return dao.find(Filmes.class, f.getId());
	}

	public Filmes removerFilmes(Long id) throws IdNuloException, FilmeInexistenteException {
		DAO<Filmes> dao = new DAO<Filmes>();
		if (id == null) {
			throw new IdNuloException();
		} else if (dao.find(Filmes.class, id) == null) {
			throw new FilmeInexistenteException();
		} else {
			Filmes f = dao.find(Filmes.class, id);
			dao.remove(f);
			return f;
		}
	}



}
