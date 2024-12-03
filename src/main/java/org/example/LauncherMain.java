package org.example;

public class LauncherMain {
    private final static int NUM_BIRDS = 10;
    public static void main(String[] args) {
        Cage cage = new Cage();
        Bird paco = new Bird("paco", cage);
        Bird manolo = new Bird("manolo", cage);
        Bird pochita = new Bird("pochita", cage);
        Bird pachurri = new Bird("pachurri", cage);
        Bird azulosa = new Bird("azulosa", cage);
        Bird jocoso = new Bird("jocoso", cage);
        Bird parrus = new Bird("parrus", cage);
        Bird pajarraco = new Bird("pajarraco", cage);
        Bird pocho = new Bird("pocho", cage);
        Bird aguilucho = new Bird("aguilucho", cage);


        Thread td1 = new Thread(paco);
        Thread td2 = new Thread(manolo);
        Thread td3 = new Thread(pochita);
        Thread td4 = new Thread(pachurri);
        Thread td5 = new Thread(azulosa);
        Thread td6 = new Thread(jocoso);
        Thread td7 = new Thread(parrus);
        Thread td8 = new Thread(pajarraco);
        Thread td9 = new Thread(pocho);
        Thread td10 = new Thread(aguilucho);

        td1.start();
        td2.start();
        td3.start();
        td4.start();
        td5.start();
        td6.start();
        td7.start();
        td8.start();
        td9.start();
        td10.start();

        try {
            td1.join();
            td2.join();
            td3.join();
            td4.join();
            td5.join();
            td6.join();
            td7.join();
            td8.join();
            td9.join();
            td10.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}