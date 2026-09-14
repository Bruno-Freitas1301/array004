package array004;

import javax.swing.JOptionPane;

public class ronaldo4 {

    public static void main(String[] args) {
        int numero;

        while (true) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (ou 99 para sair):"));
            
            if (numero == 99) {
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
