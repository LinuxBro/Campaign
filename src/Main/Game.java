/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Candidate.*;
import Cards.*;
import Frame.*;
import Territories.*;
import MapView.*;
import java.util.*;

/**
 *
 * @author airking
 */
public class Game {

	private ArrayList<Candidate> people;
	private Territory[] terrs;
	private Card[] deck;
	private boolean isFinished;
	private Candidate curPlay;

	public Game(ArrayList<Candidate> people) {
		this.people = people;
		terrs = new Territory[50];
		genTerritory();
		deck = new Card[12];
		genCards();
	}

	public void genTerritory() {
		terrs[0] = new Territory(States.ME, 4, people.size());
		terrs[1] = new Territory(States.NH, 4, people.size());
		terrs[2] = new Territory(States.VT, 3, people.size());
		terrs[3] = new Territory(States.MA, 12, people.size());
		terrs[4] = new Territory(States.RI, 4, people.size());
		terrs[5] = new Territory(States.CT, 7, people.size());
		terrs[6] = new Territory(States.NJ, 15, people.size());
		terrs[7] = new Territory(States.DE, 3, people.size());
		terrs[8] = new Territory(States.MD, 10, people.size());
		terrs[9] = new Territory(States.NY, 31, people.size());
		terrs[10] = new Territory(States.PA, 21, people.size());
		terrs[11] = new Territory(States.WV, 5, people.size());
		terrs[12] = new Territory(States.VA, 13, people.size());
		terrs[13] = new Territory(States.NC, 15, people.size());
		terrs[14] = new Territory(States.SC, 8, people.size());
		terrs[15] = new Territory(States.GA, 15, people.size());
		terrs[16] = new Territory(States.FL, 27, people.size());
		terrs[17] = new Territory(States.MS, 6, people.size());
		terrs[18] = new Territory(States.AL, 9, people.size());
		terrs[19] = new Territory(States.TN, 11, people.size());
		terrs[20] = new Territory(States.KY, 8, people.size());
		terrs[21] = new Territory(States.OH, 20, people.size());
		terrs[22] = new Territory(States.IN, 11, people.size());
		terrs[23] = new Territory(States.MI, 17, people.size());
		terrs[24] = new Territory(States.WI, 10, people.size());
		terrs[25] = new Territory(States.IL, 21, people.size());
		terrs[26] = new Territory(States.MN, 10, people.size());
		terrs[27] = new Territory(States.IA, 7, people.size());
		terrs[28] = new Territory(States.MO, 11, people.size());
		terrs[29] = new Territory(States.AR, 6, people.size());
		terrs[30] = new Territory(States.LA, 9, people.size());
		terrs[31] = new Territory(States.TX, 34, people.size());
		terrs[32] = new Territory(States.OK, 7, people.size());
		terrs[33] = new Territory(States.KS, 6, people.size());
		terrs[34] = new Territory(States.NE, 5, people.size());
		terrs[35] = new Territory(States.SD, 3, people.size());
		terrs[36] = new Territory(States.ND, 3, people.size());
		terrs[37] = new Territory(States.MT, 3, people.size());
		terrs[38] = new Territory(States.WY, 3, people.size());
		terrs[39] = new Territory(States.CO, 9, people.size());
		terrs[40] = new Territory(States.NM, 5, people.size());
		terrs[41] = new Territory(States.AZ, 10, people.size());
		terrs[42] = new Territory(States.UT, 5, people.size());
		terrs[43] = new Territory(States.ID, 4, people.size());
		terrs[44] = new Territory(States.WA, 11, people.size());
		terrs[45] = new Territory(States.OR, 7, people.size());
		terrs[46] = new Territory(States.CA, 55, people.size());
		terrs[47] = new Territory(States.AK, 3, people.size());
		terrs[48] = new Territory(States.HI, 4, people.size());
		terrs[49] = new Territory(States.NV, 5, people.size());
	}

	private void genCards(){
		deck[0] = new BuffSelf("Funds++", "Playing this card will increase your funds.", 8, 0);
		deck[1] = new BuffSelf("Bump Pop", "Playing this card will increase your popularity.",  8,  1);
		deck[2] = new BuffSelf("Cred Boost", "Playing this card will increase your credibility", 8, 2);
		deck[3] = new DebuffSelf("Funds--", "Playing this card will decrease your funds.", 8, 0);
		deck[4] = new DebuffSelf("Drop Pop", "Playing this card will decrease your popularity.", 8, 1);
		deck[5] = new DebuffSelf("Cred Blow", "Playing this card will decrease your credibility", 8, 2);
		deck[6] = new BuffOpponent("Funds++", "Playing this card will increase your opponenet's funds.", 8, 0);
		deck[7] = new BuffOpponent("Bump Pop", "Playing this card will increase your opponent's popularity.", 8, 1);
		deck[8] = new BuffOpponent("Cred Boost", "Playing this card will increase your opponent's credibility", 8, 2);
		deck[9] = new DebuffOpponent("Funds--", "Playing this card will decrease your opponent's funds.", 8, 0);
		deck[10] = new DebuffOpponent("Drop Pop", "Playing this card will decrease your opponent's popularity.", 8, 1);
		deck[11] = new DebuffOpponent("Cred Blow", "Playing this card will decrease your opponent's credibility", 8, 2);

	}

	public boolean isOver(){
		return isFinished;
	}

	//TODO Add popup window
	public void startTurn(){

	}

	public void drawCard(Candidate c) throws Exception{
		Random r = new Random();
		int i = r.nextInt(12);
		c.addCard(deck[i]);
	}

	//0: Fundraise
	//1: Play Card
	//#
	public void makeMove(Candidate c, int type){
		Scanner keyboard = new Scanner(System.in);
		int choice;
		Territory t;
		switch(type){
		case 0:
			c.setFunds(c.getFunds() + c.getPopularity() / 10 + 10);
			System.out.println("You now have $" + c.getFunds() + " to use");
			break;
		case 1:
			for(int i = 0; i < c.getHand().length; i++){
				Card[] hand = c.getHand();
				Card cd = hand[i];
				if(cd != null){
					System.out.println("(" + (i+1) + ") " + cd.getName());
				}
			}
			choice = Integer.parseInt(keyboard.nextLine());
			Card cardChoice = c.getHand()[choice-1];
			c.playCard(cardChoice);
			break;
		case 2:
			System.out.println("Which state do you want to view info for?");
			for(int i = 0; i < terrs.length; i++){
				System.out.println("(" + (i + 1) + ") " + terrs[i].getAbr());
			}
			choice = Integer.parseInt(keyboard.nextLine());
			t = terrs[choice - 1];
			c.setSwing(t, 5);
			break;
		case 3:
			System.out.println("Which state do you want to view info for?");
			for(int i = 0; i < terrs.length; i++){
				System.out.println("(" + (i + 1) + ") " + terrs[i].getAbr());
			}
			choice = Integer.parseInt(keyboard.nextLine());
			t = terrs[choice - 1];
			for(int i = 0; i < people.size(); i++){
				System.out.println("Player " + (i+1) + ": " + t.getPlayerSwing(i+1));
			}
			break;
		}
	}


	public void campaign(Territory state)
	{
		state.addSwing(5);
	}

	public Candidate getCurPlayer()
	{
		return curPlay;
	}
	
	public Candidate tally(){
		int[] scores = new int[people.size()];
		for(int j = 0; j < scores.length; j++){
			scores[j] = 0;
		}
		for(Territory t : terrs){
			int winner = t.findWinner();
			scores[winner] += t.getVotes();
		}
		int winner = 0;
		for(int i = 1; i < scores.length; i++){
			if(scores[i] > scores[winner]){
				winner = i;
			}
		}
		return people.get(winner);
	}

}
