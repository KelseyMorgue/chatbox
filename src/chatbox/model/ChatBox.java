package chatbox.model;

public class ChatBox
{
	private String name;
	private int chatCount;
	
	public ChatBox(String name)
	{
		this.name = name;
		chatCount = 0;
		
				
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
}

