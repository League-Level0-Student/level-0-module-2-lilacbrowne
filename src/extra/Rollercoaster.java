package extra;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {

	String answer = JOptionPane.showInputDialog("How tall are you in inches?");
	int x = Integer.parseInt(answer);

	if (x > 48) {
		JOptionPane.showMessageDialog(null, "You can ride the rollercoaster!");
	} else if (x <= 48) {
		JOptionPane.showMessageDialog(null, "You need to grow more!");
	}
}
}
