package net.com.salesianos.productorconsumidor.modelo;

public class Verdura {
  private String tipo;
  private int tiempoCrecimiento;

  public Verdura(String tipo, int tiempoCrecimiento) {
    this.tipo = tipo;
    this.tiempoCrecimiento = tiempoCrecimiento;
  }

  public String getTipo() {
    return tipo;
  }

  public int getTiempoCrecimiento() {
    return tiempoCrecimiento;
  }

  @Override
  public String toString() {
    return tipo;
  }
}
