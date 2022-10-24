package com.rplbo.mycomputer;

import java.security.PublicKey;

public class Laptop extends Computer{
    private Keyboard keyboard;
    private Monitor monitor;

    public Laptop(Storage storage, Monitor monitor, Keyboard keyboard) {
        super(storage);
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
    public void showDisplay(){
        monitor.display(super.getStorage());
    }

    public void retrieveData(int data) {
        String dt=""+(double)data;
        super.retrieveData(dt);
    }
    public void retrieveData(double data) {
        String dt=""+(double)data;
        super.retrieveData(dt);
    }
}