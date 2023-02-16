/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pianos;

/**
 *
 * @author koeshoro
 */
// Clase Pared que hereda de la clase Piano y representa un piano vertical o de pared
class Pared extends Piano {

   // Constructor de la clase Pared 
   public Pared(String modelo, double precio) { 
     super(modelo, precio); 
   } 

   // Método para obtener el tipo del piano 
   @Override 
   public String getTipo() { 
     return "Pared"; 
   }  
}