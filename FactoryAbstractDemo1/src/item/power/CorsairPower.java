package item.power;

import base.Power;

public class CorsairPower implements Power {

	@Override
	public String getManufacturers() {
		
		return "Corsair";
	}

	@Override
	public String getDescription() {
		
		return getManufacturers()+"/CX500V2"+"/"+getPower()+"W";
	}

	@Override
	public int price() {
		
		return 430;
	}

	@Override
	public int getPower() {
		
		return 550;
	}

}
