package com.overriding;

public class Main {
    public static void main(String[] args){

        Kucing kucing = new Kucing();
        kucing.suara();

        Hewan hewan = new Hewan();
        hewan.suara();

        bebek Bebek = new bebek();
        Bebek.suara();

        macan Macan = new macan();
        Macan.suara();
    }
}
