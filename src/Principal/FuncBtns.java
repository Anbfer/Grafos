/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Telas.Menu;
import javax.swing.JOptionPane;

/**
 *
 * @author angeloabf
 */
public class FuncBtns {
    
    public FuncBtns() {
    }
    
    public void sair() {
        Object[] options = {"Confirmar", "Cancelar"};

        int escolha = JOptionPane.showOptionDialog(null, "Deseja encerrar o programa?", "Fechar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (escolha == 0) {
            System.exit(0);
        }
    }
    public void voltar(){
        new Menu().setVisible(true);
    }
}
