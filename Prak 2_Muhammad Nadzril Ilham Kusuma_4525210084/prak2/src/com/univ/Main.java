package com.univ;

public class Main {
    public static void main(String[] args) {
        // Objek pertama : nadzril
        mahasiswa nadzril = new mahasiswa(
            "2", 
            "nad", 
            "kus", 
            "02", 
            "jak", 
            19, 
            "it");
            

        // Tampilkan info
        nadzril.displayInfo();
        

        // Panggil method belajar dan ujian
        nadzril.belajar();
        
    }
}
