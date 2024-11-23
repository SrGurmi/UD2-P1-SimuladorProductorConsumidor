package net.com.salesianos.productorconsumidor.hilos;


import net.com.salesianos.productorconsumidor.modelo.Almacen;
import net.com.salesianos.productorconsumidor.modelo.Verdura;

public class Consumidor extends Thread {
  private final Almacen almacen;
  private final String nombre;
  private final int cantidadConsumir;

  public Consumidor(Almacen almacen, String nombre, int cantidadConsumir) {
    this.almacen = almacen;
    this.nombre = nombre;
    this.cantidadConsumir = cantidadConsumir;
  }

  @Override
  public void run() {
    try {
      for (int i = 0; i < cantidadConsumir; i++) {
        Verdura verdura = almacen.consumir();
        Thread.sleep(verdura.getTiempoCrecimiento());
        System.out.println(nombre + " ha consumido: " + verdura);
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
