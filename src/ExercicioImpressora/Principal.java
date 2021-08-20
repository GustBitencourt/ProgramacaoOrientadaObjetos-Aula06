package ExercicioImpressora;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Impressora impressora = new Impressora("epson", "Wi-fi", LocalDate.of(2021,8,20));
        System.out.println(impressora.getDataFabricacao());
    }
}
