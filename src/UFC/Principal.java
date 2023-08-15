package UFC;

import UFC.Luta.luta;
import UFC.Lutador.Lutador;

public class Principal {
    public static void main(String[] args) {
        luta l = new luta();

        l.marcarLuta(
                new Lutador("Kewin",20),
                new Lutador("Joao",20)
        );

    }
}
