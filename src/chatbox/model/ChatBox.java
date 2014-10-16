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
	public String processText(String input)
	{
		String processedText = "";
		return processedText;
	}
}


