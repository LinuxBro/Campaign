/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candidate;

import java.util.*;

/**
 *
 * @author airking
 */
class Candidate {
    int funds;
    String name;
    int numPlayer;
    int type;
    Card[] hand;
    HashMap<String, Integer> swings = new HashMap<String, Integer>();
    int credibility;
    HashMap<String, Integer> swings;

    Candidate(String name, int type, int numPlayer) {
        this.swings = new int[50];
        this.hand = new Card[3];
        setName(name);    
        swings = new HashMap<String, Integer>();
swings.put("AL", 1);
swings.put("AK", 1);
swings.put("AZ", 1);
swings.put("AR", 1); 
swings.put("CA", 1);
swings.put("CO", 1);
swings.put("CT", 1);
swings.put("DE", 1);
swings.put("FL", 1);
swings.put("GA", 1);
swings.put("HI", 1);
swings.put("ID", 1);
swings.put("IL", 1);
swings.put("IN", 1);
swings.put("IA", 1);
swings.put("KS", 1);
swings.put("KY", 1);
swings.put("LA", 1);
swings.put("ME", 1);
swings.put("MD", 1);
swings.put("MA", 1);
swings.put("MI", 1);
swings.put("MN", 1);
swings.put("MS", 1);
swings.put("MO", 1);
swings.put("MT", 1);
swings.put("NE", 1);
swings.put("NV", 1);
swings.put("NH", 1);
swings.put("NJ", 1);
swings.put("NM", 1);
swings.put("NY", 1);
swings.put("NC", 1);
swings.put("ND", 1);
swings.put("OH", 1);
swings.put("OK", 1);
swings.put("OR", 1);
swings.put("PA", 1);
swings.put("RI", 1);
swings.put("SC", 1);
swings.put("SD", 1);
swings.put("TN", 1);
swings.put("TX", 1);
swings.put("UT", 1);
swings.put("VT", 1);
swings.put("VA", 1);
swings.put("WA", 1);
swings.put("WV", 1);
swings.put("WI", 1);
swings.put("WY", 1);

    }
   public int getFunds(){
       return this.funds;
   } 
   public String getName(){
        return this.name;
    }
   public int getNumPlayer(){
       return this.numPlayer;
   }
   //subclass this
   public int getType(){
       return this.type;
   }
   public Card getCard(int n){
       return this.hand[n-1];
   }
   public int getSwings(int n){
       return this.swings[n-1];
   }
   public int getCred(){
       return this.credibility;
   }
   public void setCred(int n){
       this.credibility = n;
   }
   public void setNumPlayer(int n){
       this.numPlayer = n;
   }
   public void setFunds(int n){
       this.funds = n;
   }
   /**
    *sets the value of a swing for a state in the swing array 
    * @param n State to be changed
    * @param m new value for the swing in that state
    */
   public void setSwings( ){
       swings
   }
   
    public void setName(String name){
    this.name = name;
}}