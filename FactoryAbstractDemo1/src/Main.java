import factory.HPComputerFactory;
import factory.LemelComputerFactory;
import base.AbstractComputerFactory;


public class Main {

	public static void main(String[] args){
		buyComputer(new HPComputerFactory());
		buyComputer(new LemelComputerFactory());
	}
	/**
	 * 購買電腦
	 * @param computerFactory 電腦工廠
	 */
	public static void buyComputer(AbstractComputerFactory computerFactory){
		System.out.println("======="+computerFactory.getClass()+" Computer Specifications=======");
		System.out.println("CPU:"+computerFactory.getCPU().getDescription());
		System.out.println("DISPLAY_CARD:"+computerFactory.getDisplayCard().getDescription());
		System.out.println("POWER:"+computerFactory.getPower().getDescription());
		System.out.println("RAM:"+computerFactory.getRAM().getDescription());
		System.out.println("TotalPrice:"+computerFactory.getTotalPrice());
	}
}
