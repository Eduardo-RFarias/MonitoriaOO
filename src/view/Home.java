package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import controller.HomeController;

/**
 * 
 */

/**
 * @author Eduardo
 *
 */
public class Home extends JFrame implements ActionListener {
	private final JLabel labelTexto;
	private final JTextField fieldTexto;
	private final JButton botao;
	private final JButton botao2;
	private final HomeController controller;

	public Home() {
		super("My Home Page");
		this.controller = new HomeController(this);

		this.setSize(900, 700);
		this.setLayout(new GridLayout(2, 2));

		labelTexto = new JLabel("Texto:");

		fieldTexto = new JTextField();

		botao = new JButton("Bot�o");
		botao.addActionListener(this);

		botao2 = new JButton("Bot�o 2");
		botao2.addActionListener(this);

		this.add(labelTexto);
		this.add(fieldTexto);
		this.add(botao);
		this.add(botao2);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controller.executarBotao(e);
	}

	public JLabel getLabelTexto() {
		return labelTexto;
	}

	public JTextField getFieldTexto() {
		return fieldTexto;
	}

	public JButton getBotao() {
		return botao;
	}

	public JButton getBotao2() {
		return botao2;
	}

	public HomeController getController() {
		return controller;
	}
}
