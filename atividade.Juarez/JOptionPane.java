/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane;

/**
 *
 * @author Aluno CA
 */
import javax.swing.JOptionPane;
public class JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Exibe uma caixa de diálogo com várias opções
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, 
            "Escolha uma opção:", 
            "Menu de Opções", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, opcoes, opcoes[0]);
        
        switch (escolha) {
            case 0:
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 1!");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 2!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você escolheu a Opção 3!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saindo...");
                System.exit(0); // Encerra o programa
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção válida selecionada.");
        }
    }
}    
    

