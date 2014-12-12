package chatbox.controller;

import javax.swing.JOptionPane;

import chatbox.view.ChatboxFrame;
import chatbox.view.ChatboxPanel;
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
	 * GUI frame for the application.
	 */
	private ChatboxFrame baseFrame;
	
	/**
	 * Creates a ChatboxAppController and initializes the associated View and Model objects.
	 */
	public ChatboxAppController()
	{
		appView = new ChatboxView(this);
		baseFrame = new ChatboxFrame(this);
		grandpaBot = new ChatBox("Grandpa");
		startMessage = "Welcome to the" + grandpaBot.getName() +" Chatbot, type in your name.";
		endMessage = "All Done!";
	}
	/**
	 * Returns the ChatBox.
	 * @return the Chatbox
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
		ChatboxPanel myAppPanel = (ChatboxPanel) baseFrame.getContentPane();
		 myAppPanel.displayTextToUser(startMessage);
		 
//		while(!grandpaBot.quitChecker(message))
//		{
//			message = grandpaBot.processText(message);
//			message = appView.displayDialog(message);
//		}
//		quit();

	}
	public String sendTextToChatBox(String userInput)
	{
		String respondText = "";
		respondText = grandpaBot.processText(userInput);
		return respondText;
	}
	/**
	 * Quit method for ChatBox application.
	 */
	private void quit()
	{
		appView.displayMessage(endMessage);
		System.exit(0);
	}
	public ChatboxFrame getBaseFrame()
	{
		return baseFrame;
	}
}
