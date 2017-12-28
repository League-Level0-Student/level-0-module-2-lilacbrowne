
package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumber {
	public static void main(String[] args) {
		String lotto = "";
		for (int i = 0; i < 5; i++) {
			int r = 0;
			Random gen = new Random();
			r = gen.nextInt(10) + 1;
			lotto += "  " + r;
		}
		JOptionPane.showMessageDialog(null, lotto);

	}
}
