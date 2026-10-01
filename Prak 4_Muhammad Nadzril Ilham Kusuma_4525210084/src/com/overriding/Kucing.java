package com.overriding;

public class Kucing extends Hewan {
       
    @Override 
    void suara(){
        System.out.println("kucing berkata: meong");
    }   
}
