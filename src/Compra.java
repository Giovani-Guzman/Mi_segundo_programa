
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Compra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
   double cant_pag ;
            
    Scanner scanner = new Scanner (System.in);
  
     System.out.print("Teclee la cantidad de la compra" ) ;
     double compra = scanner.nextDouble();
     
     if (compra >1000){ 
         cant_pag = compra -(compra*0.20) ;
  
    }
     else{ 
 cant_pag = compra-(compra * 0.10) ;}
 
   System .out.println("El total a pagar es: " + cant_pag );
   
    
     
     
    
    }
    
}
