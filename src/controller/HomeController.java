package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import Database.DB;
import exception.PessoaModelException;
import model.Pessoa;
import view.Home;

/**
 * @author Eduardo
 *
 */
public class HomeController {
	private final Home view;

	public HomeController(Home view) {
		super();
		this.view = view;
	}

	public void executarBotao(ActionEvent e) {
		JButton botaoPressionado = (JButton) e.getSource();

		if (botaoPressionado == view.getCancelar()) {
			this.view.dispose();
		} else {

			try {
				DB.getPessoas().add(this.createModel());
				System.out.println(DB.getPessoas());
			} catch (PessoaModelException ex) {
				ex.printStackTrace();
			}

		}
	}

	private Pessoa createModel() throws PessoaModelException {
		String nome = this.view.getFieldNome().getText();

		if (nome.isBlank()) {
			throw new PessoaModelException("Erro no cadastro, nome não pode estar em branco.");
		}

		Integer idade = null;

		try {
			idade = Integer.parseInt(this.view.getFieldIdade().getText());
		} catch (NumberFormatException ex) {
			throw new PessoaModelException("Erro no cadastro, idade digitada é um número inválido.");
		}

		if (idade < 1) {
			throw new PessoaModelException("Erro no cadastro, idade não pode ser menor que 1");
		}

		return new Pessoa(nome, idade);
	}

	public Home getView() {
		return view;
	}
}
