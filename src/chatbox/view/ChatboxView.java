package chatbox.view;

import javax.swing.JOptionPane;
import chatbox.controller.ChatboxAppController;

/**
 * Gui display for the Chatbox project.
 * 
 * @author kelseyhenrichsen
 * @version 1.1 10/4/14
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
    public String displayInformation(String input)
    {
	String output = "";
	output = JOptionPane.showInputDialog(null, input = "stuff");
	return output;
    }
}
