package Territories;

import Cards.*;
import Candidate.*;

public class Territory 
{
	States abr; 
	int totalSwing;
	int votes;
	int[] playerSwings;

	public Territory(States name, int votes, int numPlayers)
	{
		this.abr = name;
		this.votes = votes;
		this.totalSwing = numPlayers;
		playerSwings = new int[numPlayers];
		for(int i = 0; i < playerSwings.length; i++){
			playerSwings[i] = 1;
		}
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
	
	public void addPlayerSwing(int pNum, int amt){
		playerSwings[pNum - 1] = playerSwings[pNum - 1] + amt;
	}
	
	public int getPlayerSwing(int pNum){
		return playerSwings[pNum - 1];
	}
	
	public int findWinner(){
		int winner = 0;
		for(int i = 1; i < playerSwings.length; i++){
			if(playerSwings[i] > winner){
				winner = i;
			}
		}
		return winner;
	}
}
