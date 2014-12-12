package chatbox.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbox.controller.ChatboxAppController;

/**
 * This is the panel for Chatbox.
 * 
 * @author Kelsey Henrichsen
 * @version 1.1 10/23/14
 */
public class ChatboxPanel extends JPanel
{
	private ChatboxAppController baseController;

	private JButton sampleButton;
	private JTextField sampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout baseLayout;

	/**
	 * Creates buttons, text fields, and a scrolling option in Chatbox.
	 * 
	 * @param baseController
	 */

	public ChatboxPanel(ChatboxAppController baseController)
	{
		this.baseController = baseController;

		sampleButton = new JButton("Click me!!");
		sampleField = new JTextField(25);
		chatArea = new JTextArea(5, 25);
		chatPane = new JScrollPane(chatArea);
		baseLayout = new SpringLayout();

		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Sets up ScrollPane, Panel, Layout, and Listeners.
	 */
	private void setupScrollPane()
	{
		chatArea.setWrapStyleWord(true);
		chatArea.setLineWrap(true);
		chatArea.setEnabled(false);
	}

	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(baseLayout);
		this.add(sampleButton);
		this.add(sampleField);
		this.add(chatPane);
		// this.add for everything except chatArea
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, -75, SpringLayout.EAST, chatPane);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, 16, SpringLayout.SOUTH, sampleButton);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 0, SpringLayout.WEST, chatPane);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 25, SpringLayout.SOUTH, chatPane);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 30, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 130, SpringLayout.WEST, this);
	}

	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userTypedText = sampleField.getText();
				String chatboxResponse = baseController.sendTextToChatBox(userTypedText);
			    sampleField.setText("");
				displayTextToUser(userTypedText);
				displayTextToUser(chatboxResponse);
				
			}
		});
	}
	public void displayTextToUser(String input)
	{
		chatArea.append(input + "\n");
	}
}
