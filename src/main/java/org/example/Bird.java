package org.example;

import java.util.Random;

public class Bird implements Runnable{
    private String name;
    private Cage cage;

    public Bird (String nom, Cage cage){
        this.name=nom;
        this.cage=cage;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        while(true){
            //Assume that each bird takes between 500 and 1000 ms to eat.
            Random rm = new Random();
            int balance = rm.nextInt(500, 1001);
            cage.eating(this);
            try {
                Thread.sleep(balance);
                System.out.println(name+" stops eating");
                cage.setPlate(this);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //Assume that each bird takes between 500 and 2000 ms to swing.
            cage.swinging(this);
            try {
                Thread.sleep(500, 2001);
                System.out.println(name+" stops swinging");
                cage.setSwing(this);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
