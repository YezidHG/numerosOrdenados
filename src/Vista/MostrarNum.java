/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Control.MayorMenor; 
import java.util.Scanner; 
/**
 *
 * @author Personal
 */
public class MostrarNum {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

        System.out.println("Ingrese el número 1 :"); 

        int num1 = sc.nextInt(); 

        System.out.println("Ingrese el número 2:"); 

        int num2 = sc.nextInt(); 

        System.out.println("Ingrese el número 3:"); 

        int num3 = sc.nextInt(); 

        MayorMenor numeros = new MayorMenor(num1,num2,num3); 

        numeros.imprimir(); 

    }  
}
