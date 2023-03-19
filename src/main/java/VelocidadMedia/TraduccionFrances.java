package VelocidadMedia;

import java.util.Scanner;

class TraduccionFrances implements Traduccion {
    @Override
    public double introducirDistancia(Scanner teclado) {
        System.out.println("Entrez la distance parcourue (km) :");
        return teclado.nextDouble();
    }

    @Override
    public double introducirTiempo(Scanner teclado) {
        System.out.println("Entrez le temps du voyage (min) :");
        return teclado.nextDouble();
    }

    @Override
    public String getRespuestaFormato() {
        return "Vous avez parcouru à une vitesse de %.2f km/h.";
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Le résultat est :");
    }

    @Override
    public void finRespuesta() {
        System.out.println("Merci d'avoir utilisé le programme.");
    }
}
