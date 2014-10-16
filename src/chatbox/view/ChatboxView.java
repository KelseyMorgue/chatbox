package chatbox.view;

import javax.swing.JOptionPane;
import chatbox.controller.ChatboxAppController;

/**
 * Gui display for the Chatbox project.
 * 
 * @author kelseyhenrichsen
 * @version 1.2 10/16/14
 */
public class ChatboxView
{
	private ChatboxAppController baseController;

	public ChatboxView(ChatboxAppController baseController)
	{
		this.baseController = baseController;
	}

	/**
	 * Displays in a pop-up window using the supplied string information.
	 * 
	 * @param input
	 * @return
	 */
	public String displayDialog(String input)
	{
		String output = "";
		output = JOptionPane.showInputDialog(null, baseController.getGrandpaBot().getName() + " says: " + input);
		return output;
	}
	public void displayMessage(String input)
	{
		JOptionPane.showMessageDialog(null, baseController.getGrandpaBot().getName() + " says: " + input);
		
	}
}
