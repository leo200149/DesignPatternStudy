package edu.hyc.sidedish;

import edu.hyc.base.Food;
import edu.hyc.base.SideDish;

public class PorkChop extends SideDish {

	public PorkChop(Food food) {
		super(food);
		description = "PorkChop";
		cost = 20;
		price = 55;
	}
}