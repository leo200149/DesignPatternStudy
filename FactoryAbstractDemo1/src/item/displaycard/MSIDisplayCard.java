package item.displaycard;

import base.DisplayCard;

public class MSIDisplayCard implements DisplayCard {

	@Override
	public String getManufacturers() {
		
		return "MSI";
	}

	@Override
	public String getDescription() {
		
		return getManufacturers()+"/"+getIC()+"/"+getRAM();
	}

	@Override
	public int price() {
		
		return 1390;
	}

	@Override
	public int getGPUClock() {
		
		return 1000;
	}

	@Override
	public String getRAM() {
		
		return "2GB DDR5";
	}

	@Override
	public String getIC() {
		
		return "R9 270";
	}

}
