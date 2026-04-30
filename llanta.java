
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class llanta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   double total_pg ;
 Scanner scanner = new Scanner (System.in);
 
 System.out.print("teclee la cantidad de llantas " ) ;
   double can_llan= scanner.nextDouble();
  
       if (can_llan > 5){
         total_pg = can_llan * 700 ;
      }
       else{ 
       total_pg = can_llan * 800 ;
       }
      System .out.println("El total a pagar es: " + total_pg );
        
        
        
        
        
        
        
        
    }
    
}
