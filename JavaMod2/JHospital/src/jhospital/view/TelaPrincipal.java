/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jhospital.view;

import jhospital.view.cadastro.CadastroDePacienteView;

/**
 *
 * @author mathe
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPincipal
     */
    public TelaPrincipal() {
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

        tabbedPanePrincipal = new javax.swing.JTabbedPane();
        menuPrincipal = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        menuItemCadastroPaciente = new javax.swing.JMenuItem();
        menuItemCadastroVisitante = new javax.swing.JMenuItem();
        menuItemCadastroMedico = new javax.swing.JMenuItem();
        menuItemCadastroEnfermeiro = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuItemConsultaPaciente = new javax.swing.JMenuItem();
        menuItemConsultaEnfermeiro = new javax.swing.JMenuItem();
        menuItemConsultaVisitante = new javax.swing.JMenuItem();
        menuItemConsultaMedico = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JHospital");
        setName("telaPrincipal"); // NOI18N

        menuArquivo.setText("Arquivo");

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, 0));
        menuItemSair.setText("Sair");
        menuArquivo.add(menuItemSair);

        menuPrincipal.add(menuArquivo);

        menuCadastro.setText("Cadastro");
        menuCadastro.setToolTipText("");

        menuItemCadastroPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        menuItemCadastroPaciente.setText("Cadastro Paciente");
        menuItemCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroPacienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroPaciente);

        menuItemCadastroVisitante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, 0));
        menuItemCadastroVisitante.setText("Cadastro Visitante");
        menuItemCadastroVisitante.setToolTipText("");
        menuItemCadastroVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroVisitanteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroVisitante);

        menuItemCadastroMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        menuItemCadastroMedico.setText("Cadastro Médico");
        menuCadastro.add(menuItemCadastroMedico);

        menuItemCadastroEnfermeiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        menuItemCadastroEnfermeiro.setText("Cadastro Enfermeiro");
        menuCadastro.add(menuItemCadastroEnfermeiro);

        menuPrincipal.add(menuCadastro);

        menuConsulta.setText("Consulta");

        menuItemConsultaPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        menuItemConsultaPaciente.setText("Consulta Paciente");
        menuItemConsultaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaPacienteActionPerformed(evt);
            }
        });
        menuConsulta.add(menuItemConsultaPaciente);

        menuItemConsultaEnfermeiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        menuItemConsultaEnfermeiro.setText("Consulta Enfermeiro");
        menuConsulta.add(menuItemConsultaEnfermeiro);

        menuItemConsultaVisitante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, 0));
        menuItemConsultaVisitante.setText("Consulta Visitante");
        menuItemConsultaVisitante.setToolTipText("");
        menuConsulta.add(menuItemConsultaVisitante);

        menuItemConsultaMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        menuItemConsultaMedico.setText("Consulta Médico");
        menuConsulta.add(menuItemConsultaMedico);

        menuPrincipal.add(menuConsulta);

        menuAjuda.setText("Ajuda");

        menuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        menuItemSobre.setText("Sobre");
        menuAjuda.add(menuItemSobre);

        menuPrincipal.add(menuAjuda);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroPacienteActionPerformed
      tabbedPanePrincipal.add("Cadastro de Paciente", new CadastroDePacienteView(tabbedPanePrincipal));
      tabbedPanePrincipal.revalidate();
      tabbedPanePrincipal.repaint();
    }//GEN-LAST:event_menuItemCadastroPacienteActionPerformed

    private void menuItemConsultaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultaPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemConsultaPacienteActionPerformed

    private void menuItemCadastroVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroVisitanteActionPerformed
      
    }//GEN-LAST:event_menuItemCadastroVisitanteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* TelaPrincipal é chamada quando sistema for iniciado */
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.validate();
        telaPrincipal.pack();
        
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenuItem menuItemCadastroEnfermeiro;
    private javax.swing.JMenuItem menuItemCadastroMedico;
    private javax.swing.JMenuItem menuItemCadastroPaciente;
    private javax.swing.JMenuItem menuItemCadastroVisitante;
    private javax.swing.JMenuItem menuItemConsultaEnfermeiro;
    private javax.swing.JMenuItem menuItemConsultaMedico;
    private javax.swing.JMenuItem menuItemConsultaPaciente;
    private javax.swing.JMenuItem menuItemConsultaVisitante;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JTabbedPane tabbedPanePrincipal;
    // End of variables declaration//GEN-END:variables
}