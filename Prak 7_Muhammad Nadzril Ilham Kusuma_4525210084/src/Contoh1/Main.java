package Contoh1;

public class Main {
    public static void main(String[] args) {
        Kopi KopiBiasa = new Kopi();
        
        Kopi KopiSusu = new Kopi() {
            @Override 
            public void racik() {
                System.out.println("Racikan 1: Espresso + Susu UHT + Gula Aren. ");
            }
        };

         Kopi KopiAlpukat = new Kopi() {
            @Override 
            public void racik() {
                System.out.println("Racikan 2: Jus alpukat kental + 1 Shot Espresso + Es krim cokelat. ");
            }
        };

        KopiBiasa.racik();

        System.out.println("--- Pesanan Pertama ---");
        KopiSusu.racik();

        System.out.println("--- Pesanan Kedua ---");
        KopiAlpukat.racik();
    }
}
