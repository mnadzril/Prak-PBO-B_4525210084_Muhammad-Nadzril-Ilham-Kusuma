package Interface;

public class pengguna {
    private Handphone phone;

    public pengguna(Handphone phone) {
        this.phone.nyalakan();
    }

    void nyalakanHP() {
        this.phone.nyalakan();
    }
    
    void matikanHP() {
        this.phone.matikan();
    }

    void besarkanSuaraHP() {
        this.phone.besarkanSuara();
    }

    void kecilkanSuaraHP() {
        this.phone.kecilkanSuara();
    }

}
