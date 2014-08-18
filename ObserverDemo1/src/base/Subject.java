package base;

/**
 * 被觀察者(主題)
 * 
 * @author Leo_Chen
 * 
 */
public interface Subject {

    /**
     * 註冊觀察者
     */
    public void registOberserver(Observer observer);

    /**
     * 移除觀察者
     */
    public void removeOberserver(Observer observer);

    /**
     * 提醒所有觀察者
     */
    public void notifyAllOberserver();
}