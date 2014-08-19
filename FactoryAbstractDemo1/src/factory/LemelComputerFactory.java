package factory;

import item.cpu.AMDCPU;
import item.displaycard.AsusDisplayCard;
import item.power.AntecPower;
import item.ram.ADATARAM;
import base.AbstractComputerFactory;
import base.CPU;
import base.DisplayCard;
import base.Power;
import base.RAM;

/**
 * 聯強電腦工廠
 * @author Leo_Chen
 *
 */
public class LemelComputerFactory implements AbstractComputerFactory {

	@Override
	public CPU getCPU() {
		return new AMDCPU();
	}

	@Override
	public DisplayCard getDisplayCard() {
		
		return new AsusDisplayCard();
	}

	@Override
	public Power getPower() {
		
		return new AntecPower();
	}

	@Override
	public RAM getRAM() {
		
		return new ADATARAM();
	}

	@Override
	public int getTotalPrice() {
		
		return getCPU().price()+getDisplayCard().price()+getPower().price()+getRAM().price();
	}

}
