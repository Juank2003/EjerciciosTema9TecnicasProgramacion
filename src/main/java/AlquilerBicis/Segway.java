package AlquilerBicis;

import java.time.LocalDate;

public class Segway extends Ciclo {
    private double autonomia;
    private int alturaMinima;

    public Segway(String marca, String modelo, LocalDate fechaCompra, double autonomia, int alturaMinima) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
        this.alturaMinima = alturaMinima;
        this.tarifaAlquiler = 18.90;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Segways %s %s (%d años) %.0f km de autonomía %s/hora\n",
                marca, modelo, LocalDate.now().getYear() - fechaCompra.getYear(),
                autonomia, tarifaAlquiler);
    }
}