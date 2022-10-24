package com.rplbo.mycomputer;

public class CableData {
    private Computer computer1;
    private Computer computer2;

    public CableData() {}
    public boolean attach(Computer computer){
        if (computer1==null){
            computer1=computer;
            return true;
        }else if (computer2==null){
            computer2=computer;
            return true;
        }
        return false;
    }
    public boolean detach(Computer computer){
        if (computer1!=null && computer2!=null){
            if (computer1.getID()==computer.getID()){
                this.computer1=null;
                return true;
            }else if (computer2.getID()==computer.getID()){
                this.computer2=null;
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public Computer getComputer2(){
        return computer2;
    }
    public boolean sendData(Computer computer, String data){
        if (computer1==null && computer2==null){
            return false;
        }else if (computer1!=null && computer2!=null){
            if (computer1.getID()==computer.getID()){
                computer2.retrieveData(data);
                return true;
            }else if (computer2.getID()==computer.getID()){
                computer1.retrieveData(data);
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
    public Computer getComputer1(){
        return computer1;
    }
}