package com.rplbo.mycomputer;

public class Computer {
    private int ID;
    private int GlobalID;
    private CableData cableData;
    private Storage storage;

    public Computer (Storage storage){
        this.ID=GlobalID;
        this.storage = storage;
    }
    public Storage getStorage(){
        return storage;
    }
    public boolean detachCableData(){
        if (this.cableData!=null){
            this.cableData.detach(this);
            this.cableData=null;
            return true;
        }
        return false;
    }
    public void retrieveData(String){

    }
    public boolean sendData(String){

    }
    public int getID(){

    }
    public boolean attachCableData(CableData){

    }

    public void retrieveData(String data) {
    }

    public boolean attachCableData(CableData robot) {
    }
}
