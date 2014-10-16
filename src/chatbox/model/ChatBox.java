package chatbox.model;

import java.util.ArrayList;
public class ChatBox
{
	private String name;
	private int chatCount;
	private ArrayList <String> memeList;
	
	
	public ChatBox(String name)
	{
		this.name = name;
		chatCount = 0;
		this.memeList = new ArrayList <String>();
		
		fillTheMemeList();
				
	}
	
	public String getName()
	{
		return name;
	}
	public int getChatCount()
	{
		return chatCount;
	}
	public void setName(String name)
	{
		this.name = name;

	}
	
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

	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if (input != null && input.equals("Byebye"))
		{
			okToQuit = true;
		
		}
		return okToQuit;
		
	}
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
	private boolean stringChecker(String input)
	{
		boolean isLong = false;
		if (input.length()>42)
		{
			isLong = true;
		}
		return isLong;
	}
}


