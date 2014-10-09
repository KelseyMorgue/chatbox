package chatbox.controller;

import javax.swing.JOptionPane;
import chatbox.view.ChatboxView;
import chatbox.model.ChatBox;

public class ChatboxAppController
{
	private ChatBox jessbot;
	private ChatboxView appView;
	private ChatBox grandpaBot;
	private String startMessage;
	private String endMessage;

	public ChatboxAppController()
	{
		appView = new ChatboxView(this);
		grandpaBot = new ChatBox("Grandpa");
		startMessage = "Lets Begin";
		endMessage = "All Done!";

	}

	public void start()
	{

	}

	private void quit()
	{
		JOptionPane.showMessageDialog(null, "I quit!");
		System.exit(0);
	}
}
