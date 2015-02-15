package edu.hyc.base;

public abstract class SideDish extends Food{
	
	protected Food food;
	
	public SideDish(Food food){
		this.food = food;
	}
	
	@Override
	public String getDescription() {
		return description+food.getDescription();
	}

	@Override
	public int countCost() {
		return food.countCost()+cost;
	}

	@Override
	public int countPrice() {
		return food.countPrice()+price;
	}

}
