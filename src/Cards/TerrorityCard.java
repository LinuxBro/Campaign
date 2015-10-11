package Cards;

import java.util.*;
import Candidate.*;
import Territories.Territory;
public class TerrorityCard extends Card
{
	HashMap<States, Integer> map = new HashMap<States, Integer>();
	Territory terrority;
	
	public TerrorityCard(String name, String description, int strength, Territory terrority)
	{
		super(name, description, strength);
	}
	
	public int getStrength()
	{
		return this.strength;
	}
	
	public void execute(Candidate can)
	{
		can.setSwing(terrority, strength);
	}
}
