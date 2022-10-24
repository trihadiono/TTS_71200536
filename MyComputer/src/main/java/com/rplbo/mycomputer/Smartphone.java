package com.rplbo.mycomputer;

public class Smartphone extends Computer{
    private TouchScreen touchScreen;

    public Smartphone(Storage storage, TouchScreen touchScreen) {
        super(storage);
        this.touchScreen = touchScreen;
    }
    public void showDisplay(){
        touchScreen.display(super.getStorage());
    }
    public void retrieveData(int data) {
        String dt=""+data;
        super.retrieveData(dt);
    }
    public void retrieveData(double data) {
        String dt=""+(double)data;
        super.retrieveData(dt);
    }
}

