package netflixproj.net;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NetFlix implements NetFlixIF{
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("academico");

	public Filmes addFilmes(String nome, String ano, String elenco, String duraçao) throws NomeInvalidoException {
		DAO<Filmes> dao3 = new DAO<Filmes>();
		Filmes f = new Filmes();
		f.setId(22l);
		f.setNome("fiusudfy");
		dao3.save(f);
		Filmes f2 = new Filmes();
		f2.setId(23l);
		f2.setNome("ufhdsuguyf");
		dao3.save(f2);
		Filmes find111 = dao3.find(Filmes.class, 22l);
		System.out.println(find111.getId());
		return null;
		
	}

	public Filmes removerFilmes(String nome, String ano, String elenco, String duraçao) throws NomeInvalidoException {
		public void remove(F f) {
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			em.remove(f);
			em.getTransaction().commit();
			em.close();
		return null;
	}

	public Series addSeries(String nome, String ano, ArrayList<Temporada> temporadas) throws NomeInvalidoException {
		DAO<Series> dao5 = new DAO<Series>();
		Series s = new Series();
		s.setId(22l);
		s.setNome("fiusudfy");
		dao5.save(s);
		Series s2 = new Series();
		s2.setId(23l);
		s2.setNome("ufhdsuguyf");
		dao5.save(s2);
		Series find11111 = dao5.find(Series.class, 22l);
		System.out.println(find11111.getId());
		return null;
	}

	public Series removerSeries(String nome, String ano, ArrayList<Temporada> temporadas) throws NomeInvalidoException {
		public void remove(S s) {
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			em.remove(s);
			em.getTransaction().commit();
			em.close();
		return null;
	}

	public Episodio addEpisodio(String nome, String ano, ArrayList<Temporada> temporadas) throws NomeInvalidoException {
		DAO<Episodio> dao7 = new DAO<Episodio>();
		Episodio e = new Episodio();
		e.setId(22l);
		e.setElenco("fiusudfy");
		dao7.save(e);
		Episodio e2 = new Episodio();
		e2.setId(23l);
		e2.setElenco("ufhdsuguyf");
		dao7.save(e2);
		Episodio find1111111 = dao7.find(Episodio.class, 22l);
		System.out.println(find1111111.getId());
		return null;
	}

	public Episodio removerEpisodio(String nome, String ano, ArrayList<Temporada> temporadas)
			throws NomeInvalidoException {
		public void remove(E e) {
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
			em.close();
		return null;
		}

}
