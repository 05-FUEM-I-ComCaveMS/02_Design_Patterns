package com.cc.java.observer.pubsub;

import com.cc.java.observer.interfaces.Observable;
import com.cc.java.tools.Helper;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable{

    private String state;
    private List<Observer>observers;

    public Subject(){
        observers = new ArrayList<>();
    }

    // registration interface ...
    @Override
    public void attach(Observer o) {
        observers.add(o);  // Abbonieren
    }

    // deregistration interface()
    @Override
    public void detatch(Observer o) {
        observers.remove(o); // Abo beenden
    }

    // Notification interface
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            // o.update();  // Pull
            o.update(state); // Push
        }
    }

    // Observer holen sich den neuen Status ...
    public String getState() {
        return state;
    }

    // Subjekt ändert seinen Status (Post/Video ...)
    public void setState(String state) {
        this.state = state;
        Helper.output("Subject's new state: " + state);
        notifyObservers();
    }

    
    


}
