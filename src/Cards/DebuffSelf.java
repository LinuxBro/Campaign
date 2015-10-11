package Cards;

import Candidate.*;

public class DebuffSelf extends Card
{
	int effect;		//0 is funds, 1 is popularity, 2 is credibility
	
	public DebuffSelf(String name, String description, int strength, int effect)
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
			can.setFunds(can.getFunds() - (can.getPopularity() / 10 + strength));
			System.out.println("After an unforunate event, your campgaign lost a lot of money");

		}
		
		if(effect == 1){
			can.setPopularity(can.getPopularity() - strength);
			System.out.println("After a political gaffe, your are now less popular");

		}
		
		if(effect == 2){
			can.setCred(can.getCred() - (can.getPopularity() / 10 + strength));
			System.out.println("After a particularly scathing interview, you are now less less credible");

		}
	}
}
