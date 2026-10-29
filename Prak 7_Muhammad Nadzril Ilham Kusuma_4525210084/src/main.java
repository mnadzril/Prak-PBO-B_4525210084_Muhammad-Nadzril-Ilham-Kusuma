
public class main {
     public static void main(String[] args) {
        musik musikBiasa = new musik();

        musik musikPremium = new musik() {
            @Override 
            public void putar() {
                System.out.println(" nada ... ");
            }
        };

        musikPremium.putar();
        musikBiasa.putar();
     }
}
