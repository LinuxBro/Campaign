package Cards;

import Candidate.*;

public class BuffSelf extends Card
{	
	int effect;		//0 is funds, 1 is popularity, 2 is credibility
	
	public BuffSelf(String name, String description, int strength, int effect)
	{
		super(name, description, strength);
		this.effect = effect;
	}
	
	public int getStrength()
	{
		return this.strength;
	}
	
	public void execute(Candidate can)
	{
		if(effect == 0){
			can.setFunds(can.getFunds() + (can.getPopularity() / 10 + strength));
			System.out.println("Through some smart advertising, you gain a lot of money.");
		}
		
		if(effect == 1){
			can.setPopularity(can.getPopularity() + strength);
			System.out.println("You interacts very well with your fans this week. You are now more popular");
		}
		
		if(effect == 2){
			can.setCred(can.getCred() + (can.getPopularity() / 10 + strength));
			System.out.println("After unveiling new policy, you gained credibility with the American populace");
		}
	}
}