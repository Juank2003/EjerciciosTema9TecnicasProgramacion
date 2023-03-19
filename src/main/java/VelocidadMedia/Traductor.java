package VelocidadMedia;

import java.util.Scanner;

public class Traductor {
    public static void verMenu() {
        Scanner teclado = new Scanner(System.in);
        Traduccion traduccion;

        System.out.println("Seleccione una lengua / Sélectionnez la langue / Select language:");
        System.out.println("1. Español / Spanish");
        System.out.println("2. Inglés / English");
        System.out.println("3. Français / French");
        int idioma = teclado.nextInt();

        switch (idioma) {
            case 1:
                traduccion = new TraduccionEspañol();
                break;
            case 2:
                traduccion = new TraduccionIngles();
                break;
            case 3:
                traduccion = new TraduccionFrances();
                break;
            default:
                System.out.println("Langue non valide / Invalid language");
                return;
        }

        double distancia = traduccion.introducirDistancia(teclado);
        double tiempo = traduccion.introducirTiempo(teclado);
        double velocidad = distancia / (tiempo / 60.0);
        traduccion.inicioRespuesta();
        System.out.printf(traduccion.getRespuestaFormato(), velocidad);
        traduccion.finRespuesta();
    }
}


