package Territories;

import Cards.*;
import Candidate.*;

public class Territory 
{
	States abr; 
	int totalSwing;
	int votes;
	
	public Territory(States name, int votes)
	{
		this.abr = name;
                this.votes = votes;
	}
        
        public void addSwing(int swing)
        {
            totalSwing = totalSwing + swing;
        }
	
//	public void update(Candidate[] players)
//	{
//		totalSwing = 0; 
//		
//		for(int i = 0; i < players.length; i++)
//			totalSwing = totalSwing + players[i].getSwings(abr);
//	}
	
	public States getAbr()
	{
		return abr;
	}
	
	public int getVotes()
	{
		return votes;
	}
	
	public int getTotalSwing()
	{
		return totalSwing;
	}
}
