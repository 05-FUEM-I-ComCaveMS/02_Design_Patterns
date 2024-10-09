package com.cc.java.observer;

public interface Observable {

    public abstract void attach(Observer o);
    public abstract void detatch(Observer o);
    public abstract void notifyObservers();

}
