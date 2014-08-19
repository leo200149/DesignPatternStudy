package item.ram;

import base.RAM;

public class KinstonRAM implements RAM {

	@Override
	public String getManufacturers() {
		
		return "Kinston";
	}

	@Override
	public String getDescription() {
		
		return getManufacturers()+"/"+getType()+" "+getSpeed()+" "+getRAM()+"GB";
	}

	@Override
	public int price() {
		
		return 600;
	}

	@Override
	public int getRAM() {
		
		return 8;
	}

	@Override
	public int getSpeed() {
		
		return 1600;
	}

	@Override
	public String getType() {
		
		return "DDR3";
	}
}
