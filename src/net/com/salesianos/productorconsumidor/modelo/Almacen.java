package net.com.salesianos.productorconsumidor.modelo;


import java.util.LinkedList;
import java.util.Queue;

public class Almacen {
  private final int capacidad;
  private final Queue<Verdura> verduras = new LinkedList<>();

  public Almacen(int capacidad) {
    this.capacidad = capacidad;
  }

  public synchronized void agregar(Verdura verdura) throws InterruptedException {
    while (verduras.size() == capacidad) {
      wait();
    }
    verduras.add(verdura);
    System.out.println("Producción: " + verdura + " agregada al almacén.");
    notifyAll();
  }


  public synchronized Verdura consumir() throws InterruptedException {
    while (verduras.isEmpty()) {
      wait();
    }
    Verdura verdura = verduras.poll();
    System.out.println("Consumo: " + verdura + " consumida del almacén.");
    notifyAll();
    return verdura;
  }
}
