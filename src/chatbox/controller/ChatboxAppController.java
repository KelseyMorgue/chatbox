package chatbox.controller;

import javax.swing.JOptionPane;
import chatbox.view.ChatboxView;
import chatbox.model.ChatBox;
/**
 * This is the controller for the ChatBox project.
 * @author Kelsey Henrichsen 
 * @version 1.2 10/16/14
 */
public class ChatboxAppController
{
	private ChatBox jessbot;
	private ChatboxView appView;
	private ChatBox grandpaBot;
	private String startMessage;
	private String endMessage;

	/**
	 * Builds the controller and instantiates the view and model as well as assigns starting values.
	 */
	public ChatboxAppController()
	{
		appView = new ChatboxView(this);
		grandpaBot = new ChatBox("Grandpa");
		startMessage = "Lets Begin";
		endMessage = "All Done!";

	}
	/**
	 * Returns the ChatBox.
	 * @return the chatbox
	 */
	public ChatBox getGrandpaBot()
	{
		return grandpaBot;
	}
	/**
	 * Starts chatbox processing.
	 */
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
