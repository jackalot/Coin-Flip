import javax.swing.JOptionPane;
public class Start {
	public static int flip()
	{
		int randomResult = (int) Math.random();
		return randomResult;
	}
	public static int playAgain(String totalMessage)
	{
		int reply = JOptionPane.showConfirmDialog(null, totalMessage, "test", JOptionPane.YES_NO_OPTION);
		return reply;
	}
	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		String totalMessage = "Heres the heads and tails count,\n"
				+ "heads: " + heads + ",\n"
				+ "tails: " + tails + ",\n"
				+ "Would you like to flip again?"; 
		int reply = -1;
		do {
			reply = playAgain(totalMessage);
			System.out.print(reply);
		} while(reply == JOptionPane.YES_OPTION);
	}
}
