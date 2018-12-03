package netflixproj.net;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main implements Identificavel{
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("netflixproj");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Usuario p = new Usuario();
		p.setId(1l);
		p.setNome("joe");
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
	

}
