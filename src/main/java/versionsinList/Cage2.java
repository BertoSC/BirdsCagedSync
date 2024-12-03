package versionsinList;

import org.example.Bird;

public class Cage2 {
    int swingin = 0;
    int eating = 0;

    synchronized void swinging (Bird2 b){
        while (swingin==1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        swingin++;
        System.out.println(b.getName() +" begins swinging "+getSwingin());
        notifyAll();
    }

    synchronized void eating (Bird2 b){
        while (eating==3){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        eating++;
        System.out.println(b.getName()+ " begins eating "+getEating());
        notifyAll();
    }

    synchronized void stopEating (Bird2 b){
        System.out.println(b.getName()+ " stopped eating "+getEating());
    }

    synchronized void stopSwinging (Bird2 b){
        System.out.println(b.getName()+ " stopped swinging "+getSwingin());
    }

    synchronized void setEating(){
        eating--;
    }

    synchronized void setSwingin(){
        swingin--;
    }

    public synchronized int getSwingin() {
        return swingin;
    }

    public synchronized int getEating() {
        return eating;
    }
}
