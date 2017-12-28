package extra;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("How old are you in years?");
			int x = Integer.parseInt(answer);
	
	if (x >= 18) {
		String president = JOptionPane.showInputDialog("Who do you think the next president should be?");
		JOptionPane.showMessageDialog(null, "I agree, " + president + " would be a great president!");
	} else if (x < 18) {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
	}
}
}
