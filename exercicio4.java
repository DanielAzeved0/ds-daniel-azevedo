/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Random;

public class exercicio2{
    public static void main(String[] args) {
        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        Random random = new Random();

        System.out.println("Matriz A:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizA[i][j] = random.nextInt(10); // Gera números aleatórios para A
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) { // Diagonal principal
                    matrizB[i][j] = matrizA[i][j] * 3;
                } else {
                    matrizB[i][j] = matrizA[i][j] * 2;
                }
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}