/**
 * 
 */
package repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jpa.ManagerEntityFactory;
import model.Contato;

/**
 * @author carlosbarbosagomesfilho
 *
 */
public class ContatoRepository {

	private EntityManager manager = ManagerEntityFactory.entityManagerFactory();
	
	public void salvar(Contato contato) {
		this.manager.getTransaction();
		this.manager.persist(contato);
		this.manager.getTransaction().commit();
	}
}
