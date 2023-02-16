/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pianos;

/**
 *
 * @author koeshoro
 */
// Clase abstracta Piano que almacena el modelo y el precio del piano
abstract class Piano {
  private String modelo;
  private double precio;

  // Constructor de la clase Piano
  public Piano(String modelo, double precio) {
    this.modelo = modelo;
    this.precio = precio;
  }

  // Método para obtener el modelo del piano
  public String getModelo() {
    return modelo;
  }

  // Método para obtener el precio del piano
  public double getPrecio() {
    return precio;
  }

  // Método abstracto para obtener el tipo del piano
  public abstract String getTipo();
}