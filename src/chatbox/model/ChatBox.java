package chatbox.model;

import java.util.ArrayList;
/**
 * Model for the Chatbox project, has all text processing methods.
 * @author Kelsey Henrichsen
 * @version 1.3 10/16/14
 */
public class ChatBox
{
	private String name;
	private int chatCount;
	private ArrayList <String> memeList;
	private String contentArea;
	
	/**
	 * Builds chatbox with its name and meme list.
	 * @param name Grandpa
	 */
	public ChatBox(String name)
	{
		this.name = name;
		chatCount = 0;
		this.memeList = new ArrayList <String>();
		
		fillTheMemeList();
		this.contentArea = "Free Coffee";
				
	}
	/**
	 * Gets name for chatbox.
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Gets chat count for Chatbox.
	 * @return chatCount
	 */
	public int getChatCount()
	{
		return chatCount;
	}
	/**
	 * Sets the name for Chatbox.
	 * @param name Grandpa
	 */
	public void setName(String name)
	{
		this.name = name;

	}
	/**
	 * List of memes to fill the meme list.
	 */
	private void fillTheMemeList()
	{
		memeList.add("Fuckboy");
		memeList.add("One does not simply...");
		memeList.add("Hipster Ariel");
		memeList.add("Ryan Lochte");
		memeList.add("Kitties");
		memeList.add("Toddler Fist");
		memeList.add("Skeleton War");
	}
	/**
	 * Creates a checker inorder to quit Chatbox
	 * @param input
	 * @return okToQuit
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if (input != null && input.equals("Byebye"))
		{
			okToQuit = true;
		
		}
		return okToQuit;
		
	}
	/**
	 * Creates a checker for the memes.
	 * @param input
	 * @return hasMeme
	 */
	private boolean memeChecker(String input)
	{
		boolean hasMeme = false;
		for(String currentMeme: memeList)
		{
			if (input.equalsIgnoreCase(currentMeme))
			{
				hasMeme = true;
			}
		}
		return hasMeme;
	}
	/**
	 * Gives chatbox text to answer about: length of input, content, and memes.
	 * @param input
	 * @return processedText
	 */
	public String processText(String input)
	{
		String processedText = "";
		int randomChoice = (int) (Math.random() *3);
		if (input != null)
		{
			if (randomChoice == 0)
			{
				if (stringChecker(input))
				{
					processedText = "Ugh, too long dude.";
				}
				else 
				{
					processedText = "Wow, could you write any less??";
				}
			}
			else if (randomChoice == 1)
			{
				if (contentChecker(input))
				{
					processedText = "I love free coffee SOOO much, ...well free anything...";
				}
				else
				{
					processedText = "Dude, have you never had free coffee? Its the greatest.";
				}
			}
			else 
			{
				if (memeChecker(input))
				{
					processedText = "You found a meme!";
				}
				else
				{
					processedText = "You're lame, no meme.";
				}
			}
		}
		
		return processedText;
		
	}
	/**
	 * Creates a stringChecker to check length of text.
	 * @param input
	 * @return isLong
	 */
	private boolean stringChecker(String input)
	{
		boolean isLong = false;
		if (input.length()>42)
		{
			isLong = true;
		}
		return isLong;
	}
	/**
	 * Creates a contentChecker to check content for free coffee.
	 * @param input
	 * @return hasContent
	 */
	private boolean contentChecker(String input)
	{
		boolean hasContent = false;
		if (input.contains(contentArea))
		{
			hasContent = true;
		}
		return hasContent;
	}
}


