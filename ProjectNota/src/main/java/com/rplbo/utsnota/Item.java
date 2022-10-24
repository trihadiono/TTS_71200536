package com.rplbo.utsnota;

public class Item {
    private KertasHVS[] krhvs;
    private BukuTulis[] bktls;
    private Pulpen[] pen;

    public Item(KertasHVS[] krhvs, BukuTulis[] bktls, Pulpen[] pen) {
        this.krhvs = krhvs;
        this.bktls = bktls;
        this.pen = pen;
    }
     public int getJumlahBukuTulis(){
        return BukuTulis[];
     }
     public int getJumlahPen(){
        return Pulpen[];
     }

    public KertasHVS[] getKrhvs() {
        return krhvs;
    }

    public BukuTulis[] getBktls() {
        return bktls;
    }

    public Pulpen[] getPen() {
        return pen;
    }
}
