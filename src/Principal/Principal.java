package Principal;

import Telas.Menu;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal {

    public static void main(String[] args) {
        //Classe onde será iniciado o programa

        //Felinos felinos = new Felinos();
        //felinos.pantheraAncestral();
        //felinos.imprimeRelacionados("PANTHERA ANCESTRAL");
        //felinos.imprimeRelacionados("LEÃO");
        //felinos.imprimeRelacionados("LEOPARDO DAS NEVES");
        
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                .getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                        | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        new Menu().setVisible(true);
    }
}
