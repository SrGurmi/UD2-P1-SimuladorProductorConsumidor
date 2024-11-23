package net.com.salesianos.productorconsumidor.hilos;

import net.com.salesianos.productorconsumidor.modelo.Almacen;
import net.com.salesianos.productorconsumidor.modelo.Verdura;
import java.util.Random;

public class Productor extends Thread {
  private final Almacen almacen;
  private final String nombre;
  private final int cantidadVerduras;
  private final String[] tiposVerduras = {
          "lettuce", "cabbage", "onion", "spinach", "potato",
          "celery", "asparagus", "radish", "broccoli", "artichoke",
          "tomato", "cucumber", "eggplant", "carrot", "green bean"
  };
  private final Random random = new Random();

  public Productor(Almacen almacen, String nombre, int cantidadVerduras) {
    this.almacen = almacen;
    this.nombre = nombre;
    this.cantidadVerduras = cantidadVerduras;
  }

  @Override
  public void run() {
    try {
      for (int i = 0; i < cantidadVerduras; i++) {
        String tipo = tiposVerduras[random.nextInt(tiposVerduras.length)];
        int tiempoCrecimiento = random.nextInt(5000) + 1000; // Tiempo entre 1 y 5 segundos
        Verdura verdura = new Verdura(tipo, tiempoCrecimiento);
        Thread.sleep(tiempoCrecimiento); // Simula el crecimiento de la verdura
        almacen.agregar(verdura);
        System.out.println(nombre + " ha producido: " + verdura);
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
