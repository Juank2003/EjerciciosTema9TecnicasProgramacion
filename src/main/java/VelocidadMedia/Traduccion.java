package VelocidadMedia;

import java.util.Scanner;

interface Traduccion {
    double introducirDistancia(Scanner teclado);
    double introducirTiempo(Scanner teclado);
    String getRespuestaFormato();
    void inicioRespuesta();
    void finRespuesta();
}
