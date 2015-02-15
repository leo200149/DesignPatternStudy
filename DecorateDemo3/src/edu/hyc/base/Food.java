package edu.hyc.base;

public abstract class Food {
	
	protected String description = "";
	protected int cost;
	protected int price;
	
	public abstract String getDescription();
	public abstract int countCost();
	public abstract int countPrice();
}
