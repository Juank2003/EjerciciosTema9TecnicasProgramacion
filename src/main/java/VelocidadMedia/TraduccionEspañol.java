package VelocidadMedia;

import java.util.Scanner;

class TraduccionEspañol implements Traduccion {
    @Override
    public double introducirDistancia(Scanner teclado) {
        System.out.println("Introduzca la distancia recorrida (km):");
        return teclado.nextDouble();
    }

    @Override
    public double introducirTiempo(Scanner teclado) {
        System.out.println("Introduzca el tiempo del recorrido (min):");
        return teclado.nextDouble();
    }

    @Override
    public String getRespuestaFormato() {
        return "Se ha desplazado a una velocidad de %.2f km/h.";
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("El resultado es:");
    }

    @Override
    public void finRespuesta() {
        System.out.println("Gracias por utilizar el programa.");
    }
}

