package VelocidadMedia;

import java.util.Scanner;

class TraduccionIngles implements Traduccion {
    @Override
    public double introducirDistancia(Scanner teclado) {
        System.out.println("Enter the distance traveled (km):");
        return teclado.nextDouble();
    }

    @Override
    public double introducirTiempo(Scanner teclado) {
        System.out.println("Enter the time of travel (min):");
        return teclado.nextDouble();
    }

    @Override
    public String getRespuestaFormato() {
        return "You have traveled at a speed of %.2f km/h.";
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("The result is:");
    }

    @Override
    public void finRespuesta() {
        System.out.println("Thank you for using the program.");
    }
}
