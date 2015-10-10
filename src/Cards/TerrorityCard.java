package Cards;

import java.util.*;
import Candidate.*;

public class TerrorityCard extends Card
{
	HashMap<States, Integer> map = new HashMap<States, Integer>();
	States terrority;
	
	public TerrorityCard(String name, String description, int strength, String terrority)
	{
		super(name, description, strength);
	}
	
	public int getStrength()
	{
		return this.strength;
	}
	
	public void execute(Candidate can)
	{
		can.setSwings(terrority, strength);
	}
}
