package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.HomeController;

/**
 * @author Eduardo
 *
 */
public class Home extends JFrame implements ActionListener {
	private final JLabel labelNome;
	private final JTextField fieldNome;
	private final JLabel labelIdade;
	private final JTextField fieldIdade;
	private final JButton cadastrar;
	private final JButton cancelar;
	private final HomeController controller;

	public Home() {
		super("My Home Page");
		this.controller = new HomeController(this);

		this.setSize(900, 700);
		this.setLayout(new GridLayout(3, 2));

		this.labelNome = new JLabel("Nome:");
		this.add(this.labelNome);

		this.fieldNome = new JTextField();
		this.add(this.fieldNome);

		this.labelIdade = new JLabel("Idade:");
		this.add(this.labelIdade);

		this.fieldIdade = new JTextField();
		this.add(this.fieldIdade);

		this.cadastrar = new JButton("Cadastrar");
		this.cadastrar.addActionListener(this);
		this.add(this.cadastrar);

		this.cancelar = new JButton("Cancelar");
		this.cancelar.addActionListener(this);
		this.add(this.cancelar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controller.executarBotao(e);
	}

	public JLabel getLabelNome() {
		return labelNome;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public JLabel getLabelIdade() {
		return labelIdade;
	}

	public JTextField getFieldIdade() {
		return fieldIdade;
	}

	public JButton getCadastrar() {
		return cadastrar;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	public HomeController getController() {
		return controller;
	}
}
