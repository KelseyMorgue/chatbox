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

	public ChatBox getGrandpaBot()
	{
		return grandpaBot;
	}
	
	public void start()
	{
		String result = appView.displayDialog(startMessage);
		while(!grandpaBot.quitChecker(result))
		{
			result = grandpaBot.processText(result);
			result = appView.displayDialog(result);
		}
		quit();

	}
	/**
	 * Quit method for ChatBox application.
	 */
	private void quit()
	{
		appView.displayMessage(endMessage);
		System.exit(0);
	}
}
