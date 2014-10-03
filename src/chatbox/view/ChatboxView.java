package chatbox.view;

import javax.swing.JOptionPane;

public class ChatboxView
{
	public String displayInformation(String input)
	{
		String output = "";
		output = JOptionPane.showInputDialog(null, input = "stuff");
		return output;
	}
}
