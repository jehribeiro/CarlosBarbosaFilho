/**
 * 
 */
package utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author carlosbarbosagomesfilho
 *
 */
public class GeradorTabelas {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("acme");
		factory.close();
	}
}