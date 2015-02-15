package edu.hyc.sidedish;

import edu.hyc.base.Food;
import edu.hyc.base.SideDish;

public class Beef extends SideDish {

	public Beef(Food food) {
		super(food);
		description = "Beef";
		cost = 35;
		price = 70;
	}

}
