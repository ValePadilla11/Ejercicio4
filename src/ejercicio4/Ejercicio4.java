/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

    
    public static void main(String[] args) {

      int EDJUAN, EDALBER, EDANA, EDMAMA;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Ingrese edad de juan:");
      EDJUAN = entrada.nextInt();
      EDALBER= 2*EDJUAN/3;
      EDANA = 4*EDJUAN/3;
      EDMAMA=EDJUAN + EDALBER + EDANA;
      System.out.println("Las edades son: " + "ALBERTO: "+ EDALBER + 
              " JUAN: "+ EDJUAN + " ANA: " + EDANA + " MAMA: "+ EDMAMA);
    }
    
}
