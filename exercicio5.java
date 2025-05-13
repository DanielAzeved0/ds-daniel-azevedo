/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Random;

public class exercicio3{
    public static void main(String[] args) {
        int[][] matrizA = new int[6][5];
        int[][] matrizB = new int[6][5];
        Random random = new Random();

        System.out.println("Matriz A:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                matrizA[i][j] = random.nextInt(20); // Gera números aleatórios para A
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz B:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrizA[i][j] % 2 == 0) { // Verifica se o elemento é par
                    matrizB[i][j] = matrizA[i][j] + 5;
                } else { // Se o elemento for ímpar
                    matrizB[i][j] = matrizA[i][j] - 4;
                }
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}