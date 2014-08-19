package item.displaycard;

import base.DisplayCard;

public class AsusDisplayCard implements DisplayCard {

	@Override
	public String getManufacturers() {
		
		return "ASUS";
	}

	@Override
	public String getDescription() {
		
		return getManufacturers()+"/"+getIC()+"/"+getRAM();
	}

	@Override
	public int price() {
		
		return 1250;
	}

	@Override
	public int getGPUClock() {
		
		return 1072;
	}

	@Override
	public String getRAM() {
		
		return "GDDR5 2GB";
	}

	@Override
	public String getIC() {
		
		return "GTX 750 TI";
	}

}
