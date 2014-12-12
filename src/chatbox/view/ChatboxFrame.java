package chatbox.view;

import javax.swing.JFrame;

import chatbox.controller.ChatboxAppController;
/**
 * This is the frame for Chatbox.
 * @author Kelsey Henrichsen
 * @version 1.1 10/23/14
 */

public class ChatboxFrame extends JFrame
{
	/**
	 * This sets up the frame.
	 */
	private ChatboxPanel basePanel;
	public ChatboxFrame(ChatboxAppController baseController)
	{
		basePanel = new ChatboxPanel(baseController);
		setupFrame();
	}
	/**
	 * This section sets up the frame requirements. 
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(600, 400);
		this.setResizable(false);
		this.setVisible(true);
	}
}
