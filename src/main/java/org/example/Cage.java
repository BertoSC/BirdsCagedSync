package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    List<Bird> swing;
    List<Bird> plate;

    public Cage (){
        this.swing= new ArrayList<>();
        this.plate= new ArrayList<>();
    }

    public synchronized void setSwing(Bird b) {
        swing.remove(swing.indexOf(b));
    }

    public synchronized void setPlate(Bird b) {
        plate.remove(plate.indexOf(b));
    }

    synchronized void swinging (Bird b){
        while (swing.size()==1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        swing.add(b);
        System.out.println(b.getName() +" begins swinging");
        notifyAll();
    }

    synchronized void eating (Bird b){
        while (plate.size()==3){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        plate.add(b);
        System.out.println(b.getName()+ " begins eating");
        notifyAll();
    }
}
