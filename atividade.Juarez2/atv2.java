/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliacaoaluno;

/**
 *
 * @author Aluno CA
 */
import javax.swing.JOptionPane;
public class AvaliacaoAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Exibe uma caixa de diálogo para o usuário inserir a nota
        String conceito = JOptionPane.showInputDialog("Digite o canal:");

        // Verifica se a entrada não é nula (caso o usuário cancele)
        if (conceito != null) {
            conceito = conceito.toUpperCase(); // Converte para maiúsculo para facilitar a validação

            // Usa switch para avaliar o conceito
            switch (conceito) {
                case "2":
                    JOptionPane.showMessageDialog(null, "Cultura");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "SBT");
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Globo");
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Record");
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Manchete");
                    break;
                    case "11":
                    JOptionPane.showMessageDialog(null, "Gazeta");
                    break;
                case "13":
                    JOptionPane.showMessageDialog(null, "Bnadeirantes");
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Conceito inválido");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
        }
    }
    
}
