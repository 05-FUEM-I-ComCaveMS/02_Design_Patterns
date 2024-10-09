package com.cc.java.observer;

import com.cc.java.tools.Helper;

public class Subscriber extends Observer{

    private Subject s;
    private String name;


    public Subscriber(Subject s, String name) {
        this.s = s;
        this.name = name;
        s.attach(this);  // eintragen in liste
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
