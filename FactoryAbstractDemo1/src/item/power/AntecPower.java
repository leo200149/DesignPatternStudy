package item.power;

import base.Power;

public class AntecPower implements Power {

	@Override
	public String getManufacturers() {
		
		return "Antec";
	}

	@Override
	public String getDescription() {
		
		return getManufacturers()+"/NEO-ECO-400C-BR"+"/"+getPower()+"W";
	}

	@Override
	public int price() {
		
		return 340;
	}

	@Override
	public int getPower() {
		
		return 400;
	}

}
