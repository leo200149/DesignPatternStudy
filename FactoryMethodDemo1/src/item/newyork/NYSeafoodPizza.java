package item.newyork;

import base.Pizza;
/**
 * 紐約風味海鮮比薩
 * @author Leo_Chen
 *
 */
public class NYSeafoodPizza implements Pizza {

	@Override
	public String getName() {
		
		return "SeafoodPizza";
	}

	@Override
	public String getDescription() {
		
		return "NewYork special flavor "+getName();
	}

	@Override
	public void prepaid() {
		
		System.out.println(getName()+" prepaiding...");
	}

	@Override
	public void baking() {
		System.out.println(getName()+" baking...");

	}

}
