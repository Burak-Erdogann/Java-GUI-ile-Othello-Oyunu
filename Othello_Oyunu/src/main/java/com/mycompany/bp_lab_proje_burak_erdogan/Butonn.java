package com.mycompany.bp_lab_proje_burak_erdogan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JButton;

public class Butonn extends JButton {

    Point lokasyon;
    Color renk;

    public Butonn() {
        super();

    }

    public Butonn(Point lokasyon) {
        super();
        this.lokasyon = lokasyon;

    }

    public void SetRenk(Color renk) {
        this.renk = renk;
    }

}
