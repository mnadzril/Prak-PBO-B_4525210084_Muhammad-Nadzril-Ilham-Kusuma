package com.contoh1;

import java.util.ArrayList;

public class Dokter {
    private String nama;

    private ArrayList<Pasien> daftarPasien = new ArrayList<>();

    public Dokter(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tambahPasien(Pasien p) {
        if(daftarPasien.contains(p)) {
            daftarPasien.add(p);
            p.tambahDokter(this);
        }
    }

    public void periksa(Pasien pasien) {
        System.out.println("Dokter " + nama + " Sedang memeriksa pasien " + pasien.getNama());
    }

    public void tampilkanPasien() {
        System.out.println("Pasien dr. " + nama + ":");
        for (Pasien p : daftarPasien) {
            System.out.println("- " + p.getNama());
        }
    }
}
