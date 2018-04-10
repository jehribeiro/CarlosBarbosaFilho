package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contato;
import service.ContatoService;

/**
 * Servlet implementation class ContatoController
 */
@WebServlet("/ContatoController")
public class ContatoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContatoService service;

	private Contato contato;

	public ContatoController(ContatoService service) {
		this.service = service;
		this.contato = new Contato();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");

		this.contato.setNome(nome);
		this.contato.setEmail(email);

		this.service.salvar(contato);

	}

	public ContatoService getService() {
		return service;
	}

	public void setService(ContatoService service) {
		this.service = service;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
