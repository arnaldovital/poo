package netflixproj.net;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		DAO<Usuario> dao = new DAO<Usuario>();
		Usuario u = new Usuario();
		u.setId(22l);
		u.setNome("RibamarRS");
		dao.save(u);
		Usuario u2 = new Usuario();
		u2.setId(23l);
		u2.setNome("Ribamar");
		dao.save(u2);
		Usuario find = dao.find(Usuario.class, 22l);
		System.out.println(find.getId());
		
		
		DAO<Categorias> dao1 = new DAO<Categorias>();
		Categorias c = new Categorias();
		c.setId(22l);
		c.setMelhores_filmes_avaliados("RibamarRS");
		dao1.save(c);
		Categorias c2 = new Categorias();
		c2.setId(23l);
		c2.setMelhores_filmes_avaliados("Ribamar");
		dao1.save(c2);
		Categorias find1 = dao1.find(Categorias.class, 22l);
		System.out.println(find1.getId());
		
		DAO<Conteudo> dao2 = new DAO<Conteudo>();
		Conteudo co = new Conteudo();
		co.setId(22l);
		co.setDownload_de_conteudo("fljdlkjkv");
		dao2.save(co);
		Conteudo co2 = new Conteudo();
		co2.setId(23l);
		co2.setDownload_de_conteudo("lrjidehwiugf");
		dao2.save(co2);
		Conteudo find11 = dao2.find(Conteudo.class, 22l);
		System.out.println(find11.getId());
		
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
		
		DAO<Documentario> dao4 = new DAO<Documentario>();
		Documentario d = new Documentario();
		d.setId(22l);
		d.setNome("fiusudfy");
		dao4.save(d);
		Documentario d2 = new Documentario();
		d2.setId(23l);
		d2.setNome("ufhdsuguyf");
		dao4.save(d2);
		Documentario find1111 = dao4.find(Documentario.class, 22l);
		System.out.println(find1111.getId());
		
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
		
		DAO<Temporada> dao6 = new DAO<Temporada>();
		Temporada t = new Temporada();
		t.setId(22l);
		t.setLançamento("fiusudfy");
		dao6.save(t);
		Temporada t2 = new Temporada();
		t2.setId(23l);
		t2.setLançamento("ufhdsuguyf");
		dao6.save(t2);
		Temporada find111111 = dao6.find(Temporada.class, 22l);
		System.out.println(find111111.getId());
		
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
		
		DAO<Assinatura> dao8 = new DAO<Assinatura>();
		Assinatura a = new Assinatura();
		a.setId(22l);
		a.setPlano("fiusudfy");
		dao8.save(a);
		Assinatura a2 = new Assinatura();
		a2.setId(23l);
		a2.setPlano("ufhdsuguyf");
		dao8.save(a2);
		Assinatura find11111111 = dao8.find(Assinatura.class, 22l);
		System.out.println(find11111111.getId());
		
		
	}
	
	
}
