package AlquilerBicis;

import java.time.LocalDate;

public class Giroscopio extends Ciclo{
    private double autonomia;

    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, double autonomia) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
        this.tarifaAlquiler = 29.90;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Giroscopio %s %s (%d años) %.0f km de autonomía [%d min] %s/hora\n",
                marca, modelo, LocalDate.now().getYear() - fechaCompra.getYear(),
                autonomia, (int) (autonomia / 0.22), tarifaAlquiler);
    }
}