package versionsinList;

import org.example.Bird;
import org.example.Cage;

public class Launcher2 {
     public static void main(String[] args) {
            Cage2 cage = new Cage2();
            Bird2 paco = new Bird2("paco", cage);
            Bird2 manolo = new Bird2("manolo", cage);
            Bird2 pochita = new Bird2("pochita", cage);
            Bird2 pachurri = new Bird2("pachurri", cage);
            Bird2 azulosa = new Bird2("azulosa", cage);
            Bird2 jocoso = new Bird2("jocoso", cage);
            Bird2 parrus = new Bird2("parrus", cage);
            Bird2 pajarraco = new Bird2("pajarraco", cage);
            Bird2 pocho = new Bird2("pocho", cage);
            Bird2 aguilucho = new Bird2("aguilucho", cage);


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

/*    POR SI ACASO QUIERO AÑADIRLE UN LÍMITE DE PARADA

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
*/

        }
    }

