/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercico1;

/**
 *
 * @author Aluno CA
 */
public class Exercico1 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, -2, 3, -4},
                {-5, 6, -7, 8},
                {9, -10, 11, -12}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(mat);

        int[][] matModificada = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (mat[i][j] < 0) {
                    matModificada[i][j] = 0;
                } else {
                    matModificada[i][j] = mat[i][j];
                }
            }
        }

        System.out.println("\nMatriz modificada:");
        imprimirMatriz(matModificada);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}