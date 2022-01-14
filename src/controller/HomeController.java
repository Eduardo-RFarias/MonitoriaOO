package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

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

		if (botaoPressionado == view.getBotao2()) {
			this.printOlaMundo();
		} else {
			String textoLido = view.getFieldTexto().getText();
			System.out.println(textoLido);
		}
	}

	private void printOlaMundo() {
		System.out.println("ola mundo");
	}

	public Home getView() {
		return view;
	}
}
