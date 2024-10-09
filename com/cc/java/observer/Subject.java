package com.cc.java.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable{

    private String state;
    private List<Observer> observers = new ArrayList<>();

    // registration interface ...
    @Override
    public void attach(Observer o) {
        observers.add(o);  // .. lasst ein Abo da
    }

    // deregistration interface()
    @Override
    public void detatch(Observer o) {
        observers.remove(o);
    }

    // Notification interface
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            // to do
        }
    }

    // Observer holen sich den neuen Status ...
    public String getState() {
        return state;
    }

    // Subjekt ändert seinen Status (Post/Video ...)
    public void setState(String state) {
        this.state = state;
        Helper.output("The subject's state is now: " + state);
        notifyObservers();
    }

    
    


}
