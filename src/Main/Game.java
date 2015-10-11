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
        terrs[0] = new Territory(States.ME, 4);
        terrs[1] = new Territory(States.NH, 4);
        terrs[2] = new Territory(States.VT, 3);
        terrs[3] = new Territory(States.MA, 12);
        terrs[4] = new Territory(States.RI, 4);
        terrs[5] = new Territory(States.CT, 7);
        terrs[6] = new Territory(States.NJ, 15);
        terrs[7] = new Territory(States.DE, 3);
        terrs[8] = new Territory(States.MD, 10);
        terrs[9] = new Territory(States.NY, 31);
        terrs[10] = new Territory(States.PA, 21);
        terrs[11] = new Territory(States.WV, 5);
        terrs[12] = new Territory(States.VA, 13);
        terrs[13] = new Territory(States.NC, 15);
        terrs[14] = new Territory(States.SC, 8);
        terrs[15] = new Territory(States.GA, 15);
        terrs[16] = new Territory(States.FL, 27);
        terrs[17] = new Territory(States.MS, 6);
        terrs[18] = new Territory(States.AL, 9);
        terrs[19] = new Territory(States.TN, 11);
        terrs[20] = new Territory(States.KY, 8);
        terrs[21] = new Territory(States.OH, 20);
        terrs[22] = new Territory(States.IN, 11);
        terrs[23] = new Territory(States.MI, 17);
        terrs[24] = new Territory(States.WI, 10);
        terrs[25] = new Territory(States.IL, 21);
        terrs[26] = new Territory(States.MN, 10);
        terrs[27] = new Territory(States.IA, 7);
        terrs[28] = new Territory(States.MO, 11);
        terrs[29] = new Territory(States.AR, 6);
        terrs[30] = new Territory(States.LA, 9);
        terrs[31] = new Territory(States.TX, 34);
        terrs[32] = new Territory(States.OK, 7);
        terrs[33] = new Territory(States.KS, 6);
        terrs[34] = new Territory(States.NE, 5);
        terrs[35] = new Territory(States.SD, 3);
        terrs[36] = new Territory(States.ND, 3);
        terrs[37] = new Territory(States.MT, 3);
        terrs[38] = new Territory(States.WY, 3);
        terrs[39] = new Territory(States.CO, 9);
        terrs[40] = new Territory(States.NM, 5);
        terrs[41] = new Territory(States.AZ, 10);
        terrs[42] = new Territory(States.UT, 5);
        terrs[43] = new Territory(States.ID, 4);
        terrs[44] = new Territory(States.WA, 11);
        terrs[45] = new Territory(States.OR, 7);
        terrs[46] = new Territory(States.CA, 55);
        terrs[47] = new Territory(States.AK, 3);
        terrs[48] = new Territory(States.HI, 4);
        terrs[49] = new Territory(States.NV, 5);
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
		
		for(int i= 0; i < deck.length; i++)
			System.out.println(deck[i].getName());
    }
    
    public boolean isOver(){
        return isFinished;
    }
    
    //TODO Add popup window
    public void startTurn(){
        
    }
    
    public void drawCard(Candidate c) throws Exception{
        //c.addCard(deck.pop());
    }
    
    //0: Fundraise
    //1: Play Card
    //#
    public void makeMove(Candidate c, int type){
        switch(type){
        case 0:
        	c.setFunds(c.getFunds() + c.getPopularity() / 10 + 10);
        	System.out.println("You now have $" + c.getFunds() + " to use");
        	break;
        case 1:
        	for(int i = 0; i < c.getHand().length; i++){
        		Card cd = c.getHand()[i];
        		System.out.println("(" + (i+1) + ") " + cd.getName());
        	}
        	Scanner keyboard = new Scanner(System.in);
        	int choice = Integer.parseInt(keyboard.nextLine());
        	Card cardChoice = c.getHand()[choice];
        	c.playCard(cardChoice);
        	break;
        case 2:
        	Random r = new Random();
        	int randNum = r.nextInt(50);
        	c.setSwing(terrs[randNum], 5);
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

}
