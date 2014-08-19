package base;

/**
 * 抽象工廠
 * 提供一個介面，用於創建相關的物件家族。
 * 實作不同的抽象工廠，將提供不同的物件家族。
 * 決定了工廠就等於決定了會取得的物件家族。
 * 內容以工廠方法做實作。
 * @author Leo_Chen
 *
 */
public interface AbstractComputerFactory {
	
	public CPU getCPU();
	
	public DisplayCard getDisplayCard();
	
	public Power getPower();
	
	public RAM getRAM();
	
	public int getTotalPrice();
}
