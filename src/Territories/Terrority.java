package Terrority;

import Cards.*;
import Candidate.*;

public class Terrority 
{
	States abr; 
	int totalSwing;
	int votes;
	
	public Terrority(States name)
	{
		this.abr = name;
	}
	
	public void update(Candidate[] players)
	{
		totalSwing = 0; 
		
		for(int i = 0; i < players.length; i++)
			totalSwing = totalSwing + players[i].getSwings(abr);
	}
	
	public States getAbr()
	{
		return abr;
	}
	
	public int getVotes()
	{
		return votes;
	}
	
	public int totalSwing()
	{
		return totalSwing;
	}
}
