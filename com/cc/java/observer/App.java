package com.cc.java.observer;

import com.cc.java.observer.pubsub.*;
import com.cc.java.tools.Helper;

public class App {

    public static void main(String[] args) {
       

        // Objekte instanziieren
        Subject s = new Subject();
        Observer ob1 = new Observer(s, "Bob");
        Observer ob2 = new Observer(s, "Alice");
        Observer ob3 = new Observer(s, "Maxine");

        // Abonnieren
        ob1.subscribe();
        ob2.subscribe();

        s.setState("Neuer Post auf IG");
        Helper.output("---------------");
        s.setState("Neuer Live-Stream ");
        Helper.output("---------------");

        // FOMO? : Maxine abonniert ...
        ob3.subscribe();
        s.setState("Neuer Post über Solana");
        Helper.output("---------------");

        //  Maxine kündigt Ihr Abo wieder ...
        s.detatch(ob3);  

        s.setState("Neuer Post über Polkadot");
        Helper.output("---------------");


    }


}
