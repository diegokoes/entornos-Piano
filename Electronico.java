/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pianos;

/**
 *
 * @author koeshoro
 */
// Clase Electronico que hereda de la clase Piano y representa un piano electrónico
class Electronico extends Piano {

   // Constructor de la clase Electronico 
   public Electronico(String modelo, double precio) { 
     super(modelo, precio); 
   } 

   // Método para obtener el tipo del piano 
   @Override 
   public String getTipo() { 
     return "Electrónico"; 
   }  
}