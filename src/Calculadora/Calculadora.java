/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Solicitar al usuario ingresar dos números enteros
        System.out.println("Ingrese el primer número entero:");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número entero:");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        
        // Verificar que el numero no sea cero
        double division = 0;
        if (num2 != 0) {
            division = (double) num1 / num2;
        }
        
        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        // Mostrar la división solo si el divisor no es cero
        if (num2 != 0) {
            System.out.println("División: " + division);
            
            // Verificar si el resultado de la división es par o impar
            if (division % 2 == 0) {
                System.out.println("El resultado de la división es un número par.");
            } else {
                System.out.println("El resultado de la división es un número impar.");
            }
        } else {
            System.out.println("No es posible dividir entre cero.");
        }
        

    }
}
