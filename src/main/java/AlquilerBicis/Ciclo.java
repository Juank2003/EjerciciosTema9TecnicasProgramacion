package AlquilerBicis;

import java.time.LocalDate;


public abstract class Ciclo {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;
    protected double tarifaAlquiler;

    public Ciclo(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    public abstract void mostrarDetalles();

    public double obtenerTarifaAlquiler() {
        return tarifaAlquiler;
    }

    public static void verMenu(){
        Ciclo[] ciclos = {
                new Bicicleta("Lapierre", "Speed 400", LocalDate.of(2022, 3, 1), 27),
                new Bicicleta("Btwin", "Riverside 900", LocalDate.of(2023, 1, 1), 10),
                new Giroscopio("Segway", "Nine", LocalDate.of(2023, 2, 1), 40),
                new Giroscopio("Weebot", "Echo", LocalDate.of(2022, 6, 1), 35),
                new Segway("Immotion", "v8", LocalDate.of(2023, 1, 1), 40, 150),
                new Segway("Segway", "Ninebot One E+", LocalDate.of(2023, 2, 1), 30, 140)
        };

        System.out.println("Estos son los ciclos que ofrecemos en alquiler:\n");
        for (Ciclo ciclo : ciclos) {
            ciclo.mostrarDetalles();
        }
    }
}
