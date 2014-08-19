package base;

/**
 * 觀察者
 * @author Leo_Chen
 *
 */
public interface Observer{
    /**
     * 接收通知
     * @param message
     */
    public void receiveNotify(String message);
}