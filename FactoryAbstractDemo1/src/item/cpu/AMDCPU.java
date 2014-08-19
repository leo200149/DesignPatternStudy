package item.cpu;

import base.CPU;

public class AMDCPU implements CPU {

	@Override
	public String getManufacturers() {
		
		return "AMD";
	}

	@Override
	public String getDescription() {
		
		return getManufacturers()+"/"+"AM3+ FX-8320";
	}

	@Override
	public int price() {
		
		return 4550;
	}

	@Override
	public int getCores() {
		
		return 8;
	}

	@Override
	public int getBit() {
		
		return 64;
	}

}
