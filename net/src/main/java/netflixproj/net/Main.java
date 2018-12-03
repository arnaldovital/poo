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
		
		DAO<Conteudo> dao = new DAO<Conteudo>();
		Conteudo o = new Conteudo();
		o.setId(22l);
		o.setNome("RibamarRS");
		dao.save(o);
		Conteudo o2 = new Usuario();
		o2.setId(23l);
		o2.setNome("Ribamar");
		dao.save(u2);
		Usuario find = dao.find(Conteudo.class, 22l);
		System.out.println(find.getId());
	}
	
	
}
