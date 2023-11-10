/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Principal.Felinos;
import Principal.FuncBtns;

/**
 *
 * @author angeloabf
 */
public class Menu extends javax.swing.JFrame {

    FuncBtns funcoesBtns = new FuncBtns();
    Felinos felidae = new Felinos();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        felidae.inicializarFelidaes(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloGFelidae = new javax.swing.JLabel();
        felidaesBtn = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        cadastrarFelinoBtn = new javax.swing.JButton();
        cadastrarRlcFelinoBtn = new javax.swing.JButton();
        pesquisarBtn = new javax.swing.JButton();
        exibeTodosBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal - Felidae");

        tituloGFelidae.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tituloGFelidae.setText("Grafos-Felidae");

        felidaesBtn.setText("Felidaes Exemplo");
        felidaesBtn.setPreferredSize(new java.awt.Dimension(129, 23));
        felidaesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                felidaesBtnActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        cadastrarFelinoBtn.setText("Cadastrar Felidaes");
        cadastrarFelinoBtn.setMaximumSize(new java.awt.Dimension(129, 23));
        cadastrarFelinoBtn.setMinimumSize(new java.awt.Dimension(129, 23));
        cadastrarFelinoBtn.setPreferredSize(new java.awt.Dimension(129, 23));
        cadastrarFelinoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFelinoBtnActionPerformed(evt);
            }
        });

        cadastrarRlcFelinoBtn.setText("Cadastrar Relações");
        cadastrarRlcFelinoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarRlcFelinoBtnActionPerformed(evt);
            }
        });

        pesquisarBtn.setText("Pesquisar");
        pesquisarBtn.setMaximumSize(new java.awt.Dimension(129, 23));
        pesquisarBtn.setMinimumSize(new java.awt.Dimension(129, 23));
        pesquisarBtn.setPreferredSize(new java.awt.Dimension(129, 23));
        pesquisarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBtnActionPerformed(evt);
            }
        });

        exibeTodosBtn.setText("Exibe Todos");
        exibeTodosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibeTodosBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(tituloGFelidae))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cadastrarRlcFelinoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarFelinoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(felidaesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pesquisarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exibeTodosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tituloGFelidae)
                .addGap(22, 22, 22)
                .addComponent(felidaesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarFelinoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarRlcFelinoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exibeTodosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void felidaesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_felidaesBtnActionPerformed
        new PesquisarParentes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_felidaesBtnActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        funcoesBtns.sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void cadastrarFelinoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFelinoBtnActionPerformed
        felidae.adicionarEspecieFelino();
    }//GEN-LAST:event_cadastrarFelinoBtnActionPerformed

    private void cadastrarRlcFelinoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarRlcFelinoBtnActionPerformed
        felidae.adicionarRelacaoFelinos();
    }//GEN-LAST:event_cadastrarRlcFelinoBtnActionPerformed

    private void pesquisarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBtnActionPerformed
        //Inicializa os exemplos de Felinos
        felidae.buscarFelidaesEspecificos();
    }//GEN-LAST:event_pesquisarBtnActionPerformed

    private void exibeTodosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibeTodosBtnActionPerformed
        felidae.exibeTodosFelidaes();
    }//GEN-LAST:event_exibeTodosBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton cadastrarFelinoBtn;
    private javax.swing.JButton cadastrarRlcFelinoBtn;
    private javax.swing.JButton exibeTodosBtn;
    private javax.swing.JButton felidaesBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pesquisarBtn;
    private javax.swing.JLabel tituloGFelidae;
    // End of variables declaration//GEN-END:variables
}
