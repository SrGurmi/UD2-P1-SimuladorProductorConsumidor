package net.com.salesianos.productorconsumidor.main;

import net.com.salesianos.productorconsumidor.modelo.Almacen;
import net.com.salesianos.productorconsumidor.hilos.Productor;
import net.com.salesianos.productorconsumidor.hilos.Consumidor;

public class Simulador {
  public static void main(String[] args) {
    Almacen almacen = new Almacen(10);


    Productor productor1 = new Productor(almacen, "Paco", 5);
    Consumidor consumidor1 = new Consumidor(almacen, "Faustino", 5);


    productor1.start();
    consumidor1.start();
  }
}


