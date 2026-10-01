class hewan {

    String nama;
    
public void jalan() {System.out.println("hewan " + this.nama + " berjalan dan terbang " );}
public void terbang() {System.out.println("hewan " + this.nama + " berjalan dan terbang " );}


public static void main(String[] args) {
    hewan burung = new hewan();
    hewan gugug = new hewan();
    hewan kucing = new hewan();


burung.nama = "burung";
gugug.nama = "gugug";
kucing.nama = "kucing";


System.out.println();
burung.jalan();
kucing.terbang();
gugug.terbang();
System.out.println();

    }
}

