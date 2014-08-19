package item.ram;

import base.RAM;

public class ADATARAM implements RAM {

	@Override
	public String getManufacturers() {
		
		return "ADATA";
	}

	@Override
	public String getDescription() {
		
		return getManufacturers()+"/"+getType()+" "+getSpeed()+" "+getRAM()+"GB";
	}

	@Override
	public int price() {
		
		return 290;
	}

	@Override
	public int getRAM() {
		
		return 4;
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
