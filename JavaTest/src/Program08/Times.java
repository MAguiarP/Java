/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program08;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Times extends javax.swing.JFrame {

    /**
     * Creates new form Times
     */
    public Times() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoButton = new javax.swing.ButtonGroup();
        jRInter = new javax.swing.JRadioButton();
        jRCru = new javax.swing.JRadioButton();
        jRCoritiba = new javax.swing.JRadioButton();
        jBSair = new javax.swing.JButton();
        jBVeja = new javax.swing.JButton();
        jRAtleticomg = new javax.swing.JRadioButton();
        jRAtleticopr = new javax.swing.JRadioButton();
        jRPalmeiras = new javax.swing.JRadioButton();
        jRCorinthians = new javax.swing.JRadioButton();
        jRSaoPaulo = new javax.swing.JRadioButton();
        jRBotafogo = new javax.swing.JRadioButton();
        jRFlu = new javax.swing.JRadioButton();
        jRFla = new javax.swing.JRadioButton();
        jRGre = new javax.swing.JRadioButton();
        jRSantos = new javax.swing.JRadioButton();
        jRVasco = new javax.swing.JRadioButton();
        jRSport = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GrupoButton.add(jRInter);
        jRInter.setText("Internacional");

        GrupoButton.add(jRCru);
        jRCru.setText("Cruzeiro");

        GrupoButton.add(jRCoritiba);
        jRCoritiba.setText("Coritiba");

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBVeja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBVeja.setText("Veja a data de Fundação");
        jBVeja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVejaActionPerformed(evt);
            }
        });

        GrupoButton.add(jRAtleticomg);
        jRAtleticomg.setText("Atlético - MG");

        GrupoButton.add(jRAtleticopr);
        jRAtleticopr.setText("Atlético - PR");

        GrupoButton.add(jRPalmeiras);
        jRPalmeiras.setText("Palmeiras");

        GrupoButton.add(jRCorinthians);
        jRCorinthians.setText("Corinthians");

        GrupoButton.add(jRSaoPaulo);
        jRSaoPaulo.setText("São Paulo");

        GrupoButton.add(jRBotafogo);
        jRBotafogo.setText("Botafogo");
        jRBotafogo.setToolTipText("");

        GrupoButton.add(jRFlu);
        jRFlu.setText("Fluminense");

        GrupoButton.add(jRFla);
        jRFla.setText("Flamengo");
        jRFla.setToolTipText("");

        GrupoButton.add(jRGre);
        jRGre.setText("Grêmio");

        GrupoButton.add(jRSantos);
        jRSantos.setText("Santos");

        GrupoButton.add(jRVasco);
        jRVasco.setText("Vasco");
        jRVasco.setToolTipText("");

        GrupoButton.add(jRSport);
        jRSport.setText("Sport");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRAtleticomg)
                    .addComponent(jRAtleticopr)
                    .addComponent(jRPalmeiras)
                    .addComponent(jRCorinthians)
                    .addComponent(jRSantos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRVasco)
                    .addComponent(jRSaoPaulo)
                    .addComponent(jRBotafogo)
                    .addComponent(jRFlu)
                    .addComponent(jRFla))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRCoritiba)
                    .addComponent(jRInter)
                    .addComponent(jRGre)
                    .addComponent(jRCru)
                    .addComponent(jRSport))
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBVeja, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jRInter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRGre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRCru))
                    .addComponent(jRCoritiba)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRAtleticomg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRAtleticopr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRPalmeiras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRCorinthians))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRSaoPaulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBotafogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRFlu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRFla)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRVasco)
                    .addComponent(jRSantos)
                    .addComponent(jRSport))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVeja, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBVejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVejaActionPerformed
        if(jRAtleticomg.isSelected()){
            JOptionPane.showMessageDialog(null, "25 de Março de 1908");
        }
        else if(jRAtleticopr.isSelected()){
            JOptionPane.showMessageDialog(null, "26 de Março de 1924");
        }
        else if(jRPalmeiras.isSelected()){
            JOptionPane.showMessageDialog(null, "26 de Agosto de 1914");
        }
        else if(jRCorinthians.isSelected()){
            JOptionPane.showMessageDialog(null, "1 de Setembro de 1910");
        }
        else if(jRSaoPaulo.isSelected()){
            JOptionPane.showMessageDialog(null, "27 de Janeiro de 1930");
        }
        else if(jRBotafogo.isSelected()){
            JOptionPane.showMessageDialog(null, "1 de Julho de 1894");
        }
        else if(jRFlu.isSelected()){
            JOptionPane.showMessageDialog(null, "21 de Julho de 1902");
        }
        else if(jRFla.isSelected()){
            JOptionPane.showMessageDialog(null, "17 de Novembro de 1895");
        }
        else if(jRCoritiba.isSelected()){
            JOptionPane.showMessageDialog(null, "12 de Outubro de 1909");
        }
        else if(jRInter.isSelected()){
            JOptionPane.showMessageDialog(null, "04 de Abril de 1909");
        }
        else if(jRGre.isSelected()){
            JOptionPane.showMessageDialog(null, "15 de Setembro de 1903");
        }
        else if(jRCru.isSelected()){
            JOptionPane.showMessageDialog(null, "02 de Janeiro de 1921");
        }
        else if(jRSantos.isSelected()){
            JOptionPane.showMessageDialog(null, "14 de Abril de 1912");
        }
        else if(jRVasco.isSelected()){
            JOptionPane.showMessageDialog(null, "21 de Agosto de 1894");
        }
        else if(jRSport.isSelected()){
            JOptionPane.showMessageDialog(null, "13 de Maio de 1905");
        }
    }//GEN-LAST:event_jBVejaActionPerformed

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
            java.util.logging.Logger.getLogger(Times.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Times.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Times.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Times.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Times().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoButton;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBVeja;
    private javax.swing.JRadioButton jRAtleticomg;
    private javax.swing.JRadioButton jRAtleticopr;
    private javax.swing.JRadioButton jRBotafogo;
    private javax.swing.JRadioButton jRCorinthians;
    private javax.swing.JRadioButton jRCoritiba;
    private javax.swing.JRadioButton jRCru;
    private javax.swing.JRadioButton jRFla;
    private javax.swing.JRadioButton jRFlu;
    private javax.swing.JRadioButton jRGre;
    private javax.swing.JRadioButton jRInter;
    private javax.swing.JRadioButton jRPalmeiras;
    private javax.swing.JRadioButton jRSantos;
    private javax.swing.JRadioButton jRSaoPaulo;
    private javax.swing.JRadioButton jRSport;
    private javax.swing.JRadioButton jRVasco;
    // End of variables declaration//GEN-END:variables
}
