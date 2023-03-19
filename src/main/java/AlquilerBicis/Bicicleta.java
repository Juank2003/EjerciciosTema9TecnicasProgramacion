package AlquilerBicis;

import java.time.LocalDate;

public class Bicicleta extends Ciclo {
    private int numVelocidades;

    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int numVelocidades) {
        super(marca, modelo, fechaCompra);
        this.numVelocidades = numVelocidades;
        this.tarifaAlquiler = 4.90;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Bicicleta %s %s (%d años) %d velocidades %s/hora\n",
                marca, modelo, LocalDate.now().getYear() - fechaCompra.getYear(),
                numVelocidades, tarifaAlquiler);
    }
}