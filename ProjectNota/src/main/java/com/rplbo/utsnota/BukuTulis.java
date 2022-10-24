package com.rplbo.utsnota;

public class BukuTulis extends Barang{
    private String merk;

    public BukuTulis(String string, int in, String string2) {
        super(string, in, string2);
    }
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void getInformasi(){

    }
}
