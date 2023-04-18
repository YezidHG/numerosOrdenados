/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.util.Arrays;
/**
 *
 * @author Personal
 */
public class MayorMenor {
    private int num1; 

    private int num2; 

    private int num3; 

    //-------------------Constructor 

    public MayorMenor(int num1, int num2, int num3){ 

        this.num1= num1; 

        this.num2= num2; 

        this.num3= num3; 

    } 

    //--------------------Métodos 

    public void imprimir (){ 

        int a []  = {this.num1,this.num2,this.num3}; 

        Arrays.sort(a); 

        System.out.println("Los numeros ordenados de menor a mayo:"+Arrays.toString(a)); 

    } 
}
