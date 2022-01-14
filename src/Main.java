import javax.swing.WindowConstants;

import view.Home;

/**
 * @author Eduardo
 *
 */
public class Main {
	public static void main(String[] args) {
		Home home = new Home();
		home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		home.setVisible(true);
	}
}
