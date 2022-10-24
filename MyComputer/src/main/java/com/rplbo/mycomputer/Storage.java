package com.rplbo.mycomputer;

public class Storage {
    private String[] storage;

    public Storage(int row) {
        storage=new String[row];
        for (int i = 0; i < row; i++) {
            storage[i]="";
        }
    }
    public String getData(int index){
        return storage[index];
    }
    public int getSizeOfData(){
        return this.storage.length;
    }
    public boolean addData(String data){
        for (int i = 0; i < storage.length; i++) {
            if (storage[i]==""){
                storage[i]=data;
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String save="";
        for (int i = 0; i < storage.length; i++) {
            save+=""+i+" : "+storage[i]+"\n";
        }
        return save;
    }
}