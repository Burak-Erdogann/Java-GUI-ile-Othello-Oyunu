package com.mycompany.bp_lab_proje_burak_erdogan;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author thebu
 */
public class Oyun {

    Butonn[][] oyunArrayi; // butonlarin olustugu array
    int matrixGenislik;
    int matrixYükseklik;
    Color renk;

    public Oyun(int boyut) {
        this.oyunArrayi = new Butonn[boyut][boyut];
        this.matrixGenislik = boyut;
        this.matrixYükseklik = boyut;
        renk = Color.BLUE;
    }

    public Oyun() {

    }

    public void Basla() {

        //oyun baslarken ilk once siyah tas konulmasini sagliyor
        renk = Color.BLACK;

    }

}
