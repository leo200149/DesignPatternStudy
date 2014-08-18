package observer;

import base.Observer;
/**
 * ¶W¤H
 * @author admin
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
