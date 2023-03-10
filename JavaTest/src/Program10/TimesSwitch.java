/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program10;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class TimesSwitch extends javax.swing.JFrame {

    /**
     * Creates new form TimesSwitch
     */
    public TimesSwitch() {
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

        jLabel1 = new javax.swing.JLabel();
        jCBTimes = new javax.swing.JComboBox<>();
        jCBResposta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Escolha seu Time:");

        jCBTimes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Palmeiras", "Corinthians", "Santos", "São Paulo", "Botafogo", "Fluminense", "Vasco", "Flamengo", "Coritiba", "Atlético - MG", "Atlético - PR", "Cruzeiro", "Internacional", "Grêmio", "Sport" }));

        jCBResposta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBResposta.setText("Veja a data de fundação de seu time.");
        jCBResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBRespostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jCBResposta)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCBResposta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBRespostaActionPerformed
       switch(jCBTimes.getSelectedIndex()){
            case 0:
                JOptionPane.showMessageDialog(null, "26 de Agosto de 1914"); break;
            case 1:
                JOptionPane.showMessageDialog(null, "1 de Setembro de 1910"); break;
            case 2:
                JOptionPane.showMessageDialog(null, "14 de Abril de 1912"); break; 
            case 3:
                JOptionPane.showMessageDialog(null, "27 de Janeiro de 1930"); break;
            case 4:
                JOptionPane.showMessageDialog(null, "1 de Julho de 1894"); break;    
            case 5:
                JOptionPane.showMessageDialog(null, "21 de Julho de 1902"); break;    
            case 6:
                JOptionPane.showMessageDialog(null, "21 de Agosto de 1894"); break;    
            case 7:
                JOptionPane.showMessageDialog(null, "17 de Novembro de 1895"); break;    
            case 8:
                JOptionPane.showMessageDialog(null, "12 de Outubro de 1909"); break;    
            case 9:
                JOptionPane.showMessageDialog(null, "25 de Março de 1908"); break;    
            case 10:
                JOptionPane.showMessageDialog(null, "26 de Março de 1924"); break;    
            case 11:
                JOptionPane.showMessageDialog(null, "02 de Janeiro de 1921"); break;
            case 12:
                JOptionPane.showMessageDialog(null, "04 de Abril de 1909"); break;
            case 13:
                JOptionPane.showMessageDialog(null, "15 de Setembro de 1903"); break;
            case 14:
                JOptionPane.showMessageDialog(null, "13 de Maio de 1905"); break;
                         
            default:
                JOptionPane.showMessageDialog(null, ""); break;
       }
    }//GEN-LAST:event_jCBRespostaActionPerformed

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
            java.util.logging.Logger.getLogger(TimesSwitch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimesSwitch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimesSwitch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimesSwitch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimesSwitch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCBResposta;
    private javax.swing.JComboBox<String> jCBTimes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
