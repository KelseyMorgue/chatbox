package chatbox.controller;

import javax.swing.JOptionPane;

import chatbox.model.ChatBox;

public class ChatboxAppController
{
	private ChatBox jessbot;
	public void start()
	{
		
	}

	private void quit()
	{
		JOptionPane.showMessageDialog(null, "I quit!");
		System.exit(0);
	}
}
