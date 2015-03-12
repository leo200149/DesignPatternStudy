package item.taipei;

import base.Pizza;
/**
 * 台北風味牛肉比薩
 * @author Leo_Chen
 *
 */
public class TPBeefPizza implements Pizza {

	@Override
	public String getName() {
		
		return "BeefPizza";
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
		System.out.println(getName()+" Taipei's secret baking time...");

	}

}
