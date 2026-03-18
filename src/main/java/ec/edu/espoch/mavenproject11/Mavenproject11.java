package ec.edu.espoch.mavenproject11;

import java.util.Scanner;

public class Mavenproject11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //instanciar
        int[] ventas = new int[7];
        int valortotal = 0;
        int valormaximo = 0;
        int ventassuperiorpromedio = 0;
        double promedio = 0;

        //solicitar al usuario las ventas
        System.out.println("solicite el valor de las ventas: ");
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = entrada.nextInt();
            valortotal = valortotal + ventas[i];
            
            // Lógica para el valor máximo corregida (sin el ; extra)
            if (ventas[i] > valormaximo) {
                valormaximo = ventas[i];
            }
        }

        // Calcular el promedio antes de comparar
        promedio = (double) valortotal / ventas.length;

        // Segundo ciclo para comparar con el promedio
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > promedio) {
                ventassuperiorpromedio++;
            }
        }

        // Mostrar ventas ingresadas y resultados finales
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("valor= " + i + ":" + ventas[i]);
        }

        System.out.println("Valor Total de ventas= " + valortotal);
        System.out.println("Promedio ventas:" + promedio);
        System.out.println("valor maximo: " + valormaximo);
        System.out.println("ventas superior promedio: " + ventassuperiorpromedio);
    }
} 
//realizado