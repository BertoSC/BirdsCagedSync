package versionsinList;

import java.util.Random;

public class Bird2 implements Runnable {
    public static final int MIN_EAT=500;
    public static final int MAX_EAT=1001;
    public static final int MIN_SWING=500;
    public static final int MAX_SWING=2001;
    private String name;
    private Cage2 cage;

    public Bird2 (String nom, Cage2 cag){
        this.name=nom;
        this.cage=cag;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        while(true){
            //Assume that each bird takes between 500 and 1000 ms to eat.
            Random rm = new Random();
            int balance = rm.nextInt(MIN_EAT, MAX_EAT);
            cage.eating(this);
            try {
                Thread.sleep(balance);
                cage.setEating();
                cage.stopEating(this);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //Assume that each bird takes between 500 and 2000 ms to swing.
            cage.swinging(this);
            try {
                Thread.sleep(MIN_SWING, MAX_SWING);
                cage.setSwingin();
                cage.stopSwinging(this);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}