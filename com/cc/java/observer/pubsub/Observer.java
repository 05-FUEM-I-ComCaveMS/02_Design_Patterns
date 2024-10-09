package com.cc.java.observer.pubsub;

import com.cc.java.observer.interfaces.IObserve;
import com.cc.java.tools.Helper;

public class Observer implements IObserve{

    private Subject s;
    private String name;


    public Observer(Subject s, String name) {
        this.s = s;
        this.name = name;
    }


    @Override
    public void subscribe() {
        s.attach(this);  // eintragen in Observer-Liste in Subject
    }

    // Variante Pull()
    @Override
    public void update() {
        String str = name + " observes, that subject changed its state to: " + s.getState();
        Helper.output(str);
    }

    // Variante Push()
    @Override
    public void update(String msg) {
        String str = name + " observes, that subject changed its state to: " + msg;
        Helper.output(str);
    }



   





}
