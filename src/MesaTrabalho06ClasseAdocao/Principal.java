package MesaTrabalho06ClasseAdocao;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Cachorro dog1 = new Cachorro("Pit-Bull", 2020, 4.0, false, "Shesheu");
        Cachorro dog2 = new Cachorro("Vira-Lata", 2019, 6.0, true, "Toto");
        Cachorro dog3 = new Cachorro("Shitzu", 2015, 6.0, false, "Goiaba");

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
    }
}


