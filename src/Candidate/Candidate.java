/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candidate;

import java.util.*;
import Cards.*;

/**
 *
 * @author airking
 */
public class Candidate 
{
    int numPlayer;
    int type;
    int credibility;
    int popularity;
    int funds;
    String name;
    Card[] hand;
    HashMap<States, Integer> swings;

    public Candidate(String name, int type, int numPlayer)
    {
        this.name = name;  
        this.type = type;
        this.numPlayer = numPlayer;
        this.credibility = 20;
        this.funds = 20;
        hand = new Card[3];
        swings = new HashMap<States, Integer>();
	        swings.put(States.AL, 1);
	        swings.put(States.AK, 1);
	        swings.put(States.AZ, 1);
			swings.put(States.AR, 1); 
			swings.put(States.CA, 1);
			swings.put(States.CO, 1);
			swings.put(States.CT, 1);
			swings.put(States.DE, 1);
			swings.put(States.FL, 1);
			swings.put(States.GA, 1);
			swings.put(States.HI, 1);
			swings.put(States.ID, 1);
			swings.put(States.IL, 1);
			swings.put(States.IN, 1);
			swings.put(States.IA, 1);
			swings.put(States.KS, 1);
			swings.put(States.KY, 1);
			swings.put(States.LA, 1);
			swings.put(States.ME, 1);
			swings.put(States.MD, 1);
			swings.put(States.MA, 1);
			swings.put(States.MI, 1);
			swings.put(States.MN, 1);
			swings.put(States.MS, 1);
			swings.put(States.MO, 1);
			swings.put(States.MT, 1);
			swings.put(States.NE, 1);
			swings.put(States.NV, 1);
			swings.put(States.NH, 1);
			swings.put(States.NJ, 1);
			swings.put(States.NM, 1);
			swings.put(States.NY, 1);
			swings.put(States.NC, 1);
			swings.put(States.ND, 1);
			swings.put(States.OH, 1);
			swings.put(States.OK, 1);
			swings.put(States.OR, 1);
			swings.put(States.PA, 1);
			swings.put(States.RI, 1);
			swings.put(States.SC, 1);
			swings.put(States.SD, 1);
			swings.put(States.TN, 1);
			swings.put(States.TX, 1);
			swings.put(States.UT, 1);
			swings.put(States.VT, 1);
			swings.put(States.VA, 1);
			swings.put(States.WA, 1);
			swings.put(States.WV, 1);
			swings.put(States.WI, 1);
			swings.put(States.WY, 1);
    }
    
    public String getName()
    {
         return this.name;
    }
    
    public int getFunds()
    {
        return this.funds;
    } 
    
    public int getCred()
    {
        return this.credibility;
    }
    
    public int getPopularity()
    {
    	return popularity;
    }
   
   public int getNumPlayer()
   {
       return this.numPlayer;
   }
   
   //subclass this
   public int getType()
   {
       return this.type;
   }
   
   public Card getCard(int n)
   {
       return this.hand[n-1];
   }
   
   public Card[] getHand(){
       return this.hand;
   }
   
   public int getSwings(States abr)
   {
       return swings.get(abr);
       
   }
   public HashMap getSwings(){
       System.out.println(swings);
       return swings;
   }
   
   public void setName(String name)
   {
   	this.name = name;
   }
   
   public void setFunds(int n)
   {
       this.funds = n;
   }
   
   public void setCred(int n)
   {
       this.credibility = n;
   }
   
   public void setPopularity(int n)
   {
	   popularity = n;
   }
   
   public void setNumPlayer(int n)
   {
       this.numPlayer = n;
   }
   
   
   /**
    *sets the value of a swing for a state in the swing array 
    * @param n State to be changed
    * @param m new value for the swing in that state
    */
   public void setSwings(States terr, int strength)
   {
	   int temp;
	   
	   temp = swings.get(terr) + popularity / 20 + strength;
	   swings.remove(terr);
	   swings.put(terr, temp);
   }
   
   public void addCard(Card c) throws Exception{
       for(int i = 0 ; i < hand.length; i++){
           if(hand[i] == null){
               hand[i] = c;
               return;
           }
       }
       throw new Exception("Hand full");
   }
}