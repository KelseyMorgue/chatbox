package chatbox.model;

public class ChatBoxUser
{
	private int age;
	private String name;
	private String favoriteAnimal;
	private String favoriteColor;

	public ChatBoxUser()
	{
		this.age = -12;
		this.name = "";
		this.favoriteAnimal = "";
		this.favoriteColor = "";

	}

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public String getFavoriteAnimal()
	{
		return favoriteAnimal;
	}

	public String getFavoriteColor()
	{
		return favoriteColor;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setFavoriteAnimal(String favoriteAnimal)
	{
		this.favoriteAnimal = favoriteAnimal;
	}

	public void setFavoriteColor(String favoriteColor)
	{
		this.favoriteColor = favoriteColor;
	}
}
