package edu.hyc.sidedish;

import edu.hyc.base.Food;
import edu.hyc.base.SideDish;

public class Salmon extends SideDish {

	public Salmon(Food food) {
		super(food);
		description = "Salmon";
		cost = 40;
		price = 75;
	}

}
