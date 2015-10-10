package Cards;

import java.awt.Color;
import Candidate.*;

public abstract class Card 
{
	String name;
	Color color;
	String description;
	int strength;
	
	public Card(String name, String description, int strength)
	{
		this.name = name;
		this.description = description;
		this.strength = strength;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public abstract void execute(Candidate arg);
}
