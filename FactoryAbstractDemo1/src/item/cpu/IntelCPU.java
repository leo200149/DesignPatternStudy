package item.cpu;

import base.CPU;

public class IntelCPU implements CPU {

	@Override
	public String getManufacturers() {
		
		return "Intel";
	}

	@Override
	public String getDescription() {
		
		return getManufacturers()+"/Core I5-4440";
	}

	@Override
	public int price() {
		return 5600;
	}

	@Override
	public int getCores() {
		
		return 4;
	}

	@Override
	public int getBit() {
		
		return 64;
	}

}
