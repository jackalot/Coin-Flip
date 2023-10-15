import javax.swing.JOptionPane;
public class Start {
	public static void main(String[] args) {
		boolean keepGoing = false;
		int heads = 0;
		int tails = 0;
		String totalMessage = "Heres the heads and tails count,\n"
				+ "heads: " + heads + ",\n"
				+ "tails: " + tails; 
		while(keepGoing)
		{
			keepGoing = false;
		}
		JOptionPane.showMessageDialog(null, totalMessage);
	}
}
