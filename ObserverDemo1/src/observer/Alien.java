package observer;

import base.Observer;
/**
 * 外星人
 * @author Leo_Chen
 *
 */
public class Alien implements Observer{
    public void receiveNotify(String message){
        System.out.println("Alien receive world's message:"+message);   
        hahaha();       
    }
    public void hahaha(){
        System.out.println("Alien hahaha!!");
    }
}
