package observer;

import base.Observer;
/**
 * 超人
 * @author Leo_Chen
 *
 */
public class Superman implements Observer {
    public void receiveNotify(String message) {
        System.out.println("Superman receive world's message:" + message);
        go();
    }

    public void go() {
        System.out.println("Superman fight!!");
    }
}
