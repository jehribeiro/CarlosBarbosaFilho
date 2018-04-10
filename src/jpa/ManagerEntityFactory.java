/**
 * 
 */
package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author carlosbarbosagomesfilho
 *
 */
public class ManagerEntityFactory {

	public static EntityManager entityManagerFactory() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("acme");
		EntityManager manager = factory.createEntityManager();
		
		return manager;
	}
}
