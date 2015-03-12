package item.taipei;

import base.Pizza;
/**
 * 台北風味海鮮比薩
 * @author Leo_Chen
 *
 */
public class TPSeafoodPizza implements Pizza {

	@Override
	public String getName() {
		
		return "SeafoodPizza";
	}

	@Override
	public String getDescription() {
		
		return "Taipei special flavor "+getName();
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
