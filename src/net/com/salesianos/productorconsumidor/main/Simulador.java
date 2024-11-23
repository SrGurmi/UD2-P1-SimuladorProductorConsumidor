package net.com.salesianos.productorconsumidor.main;

import net.com.salesianos.productorconsumidor.modelo.Almacen;
import net.com.salesianos.productorconsumidor.hilos.Productor;
import net.com.salesianos.productorconsumidor.hilos.Consumidor;

public class Simulador {
  public static void main(String[] args) {
    Almacen almacen = new Almacen(10);


    Productor productor1 = new Productor(almacen, "Paco", 10);
    Productor productor2 = new Productor(almacen, "Ramón", 10);
    Consumidor consumidor1 = new Consumidor(almacen, "Faustino", 5);
    Consumidor consumidor2 = new Consumidor(almacen, "Mr. Gentleman", 10);
    Consumidor consumidor3 = new Consumidor(almacen, "Loquendo", 5);


    productor1.setPriority(Thread.MAX_PRIORITY);
    productor2.setPriority(Thread.MAX_PRIORITY);
    consumidor1.setPriority(Thread.MIN_PRIORITY);
    consumidor2.setPriority(Thread.MIN_PRIORITY);
    consumidor3.setPriority(Thread.MIN_PRIORITY);


    productor1.start();
    productor2.start();
    consumidor1.start();
    consumidor2.start();
    consumidor3.start();
  }
}

