/**
 * 
 */
package service;

import model.Contato;
import repository.ContatoRepository;

/**
 * @author carlosbarbosagomesfilho
 *
 */
public class ContatoService {

	private ContatoRepository repository;

	public ContatoService() {
		this.repository = new ContatoRepository();
	}

	public void salvar(Contato contato) {
		this.repository.salvar(contato);
	}
}
