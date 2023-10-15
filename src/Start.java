import javax.swing.JOptionPane;
public class Start {
	public static String UpdateMessage(int heads, int tails, String LastCoin) {
		String newMessage = "You flipped " + LastCoin + ",\n"
				+ "heres the heads and tails count,\n"
				+ "heads: " + heads + ",\n"
				+ "tails: " + tails + ",\n"
				+ "Would you like to flip again?";
		return newMessage;
	}
	public static int flip()
	{
		int max = 100;
		int min = 0;
		int range = (max - min) + 1;
		int randomResult = (int) (Math.random() * range) + min;
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
				+ "Would you like to flip a coin?"; 
		int reply = -1;
		String LastCoin = "";
		do {
			int result = flip();
			if(result > 50)
			{
				heads++;
				LastCoin = "Heads";
			}
			else
			{
				tails++;
				LastCoin = "Tails";
			}
			totalMessage = UpdateMessage(heads, tails, LastCoin);
			reply = playAgain(totalMessage);
		} while(reply == JOptionPane.YES_OPTION);
	}
}
