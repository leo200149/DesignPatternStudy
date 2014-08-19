package factory;

import item.cpu.IntelCPU;
import item.displaycard.MSIDisplayCard;
import item.power.CorsairPower;
import item.ram.KinstonRAM;
import base.AbstractComputerFactory;
import base.CPU;
import base.DisplayCard;
import base.Power;
import base.RAM;

/**
 * HP電腦工廠
 * @author Leo_Chen
 *
 */
public class HPComputerFactory implements AbstractComputerFactory {

	@Override
	public CPU getCPU() {
		
		return new IntelCPU();
	}

	@Override
	public DisplayCard getDisplayCard() {
		
		return new MSIDisplayCard();
	}

	@Override
	public Power getPower() {
		
		return new CorsairPower();
	}

	@Override
	public RAM getRAM() {
		
		return new KinstonRAM();
	}

	@Override
	public int getTotalPrice() {
		
		return getCPU().price()+getDisplayCard().price()+getPower().price()+getRAM().price();
	}

}
