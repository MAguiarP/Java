/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jhospital.view;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import jhospital.view.cadastro.CadastroDeEnfermeiroView;
import jhospital.view.cadastro.CadastroDeMedicoView;
import jhospital.view.cadastro.CadastroDePacienteView;
import jhospital.view.cadastro.CadastroDeVisitanteView;
import jhospital.view.consulta.ConsultaDeEnfermeiroView;
import jhospital.view.consulta.ConsultaDeMedicoView;
import jhospital.view.consulta.ConsultaDePacienteView;
import jhospital.view.consulta.ConsultaDeVisitanteView;

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

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);

        menuPrincipal.add(menuArquivo);

        menuCadastro.setText("Cadastro");
        menuCadastro.setToolTipText("");

        menuItemCadastroPaciente.setText("Cadastro Paciente");
        menuItemCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroPacienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroPaciente);

        menuItemCadastroVisitante.setText("Cadastro Visitante");
        menuItemCadastroVisitante.setToolTipText("");
        menuItemCadastroVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroVisitanteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroVisitante);

        menuItemCadastroMedico.setText("Cadastro Médico");
        menuItemCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroMedicoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroMedico);

        menuItemCadastroEnfermeiro.setText("Cadastro Enfermeiro");
        menuItemCadastroEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroEnfermeiroActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroEnfermeiro);

        menuPrincipal.add(menuCadastro);

        menuConsulta.setText("Consulta");

        menuItemConsultaPaciente.setText("Consulta Paciente");
        menuItemConsultaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaPacienteActionPerformed(evt);
            }
        });
        menuConsulta.add(menuItemConsultaPaciente);

        menuItemConsultaEnfermeiro.setText("Consulta Enfermeiro");
        menuItemConsultaEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaEnfermeiroActionPerformed(evt);
            }
        });
        menuConsulta.add(menuItemConsultaEnfermeiro);

        menuItemConsultaVisitante.setText("Consulta Visitante");
        menuItemConsultaVisitante.setToolTipText("");
        menuItemConsultaVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaVisitanteActionPerformed(evt);
            }
        });
        menuConsulta.add(menuItemConsultaVisitante);

        menuItemConsultaMedico.setText("Consulta Médico");
        menuItemConsultaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaMedicoActionPerformed(evt);
            }
        });
        menuConsulta.add(menuItemConsultaMedico);

        menuPrincipal.add(menuConsulta);

        menuAjuda.setText("Ajuda");

        menuItemSobre.setText("Sobre");
        menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuItemSobre);

        menuPrincipal.add(menuAjuda);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
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
        tabbedPanePrincipal.add("Consulta de Paciente", new ConsultaDePacienteView(tabbedPanePrincipal));
      tabbedPanePrincipal.revalidate();
      tabbedPanePrincipal.repaint();
    }//GEN-LAST:event_menuItemConsultaPacienteActionPerformed

    private void menuItemCadastroVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroVisitanteActionPerformed
       tabbedPanePrincipal.add("Cadastro de Visitante", new CadastroDeVisitanteView(tabbedPanePrincipal));
      tabbedPanePrincipal.revalidate();
      tabbedPanePrincipal.repaint();
    }//GEN-LAST:event_menuItemCadastroVisitanteActionPerformed

    private void menuItemCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroMedicoActionPerformed
         tabbedPanePrincipal.add("Cadastro de Médico", new CadastroDeMedicoView(tabbedPanePrincipal));
      tabbedPanePrincipal.revalidate();
      tabbedPanePrincipal.repaint();
    }//GEN-LAST:event_menuItemCadastroMedicoActionPerformed

    private void menuItemCadastroEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroEnfermeiroActionPerformed
        tabbedPanePrincipal.add("Cadastro de Enfermeiro", new CadastroDeEnfermeiroView(tabbedPanePrincipal));
      tabbedPanePrincipal.revalidate();
      tabbedPanePrincipal.repaint();
    }//GEN-LAST:event_menuItemCadastroEnfermeiroActionPerformed

    private void menuItemConsultaEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultaEnfermeiroActionPerformed
        tabbedPanePrincipal.add("Consulta de Enfermeiro", new ConsultaDeEnfermeiroView(tabbedPanePrincipal));
      tabbedPanePrincipal.revalidate();
      tabbedPanePrincipal.repaint();
    }//GEN-LAST:event_menuItemConsultaEnfermeiroActionPerformed

    private void menuItemConsultaVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultaVisitanteActionPerformed
        tabbedPanePrincipal.add("Consulta de Visitante", new ConsultaDeVisitanteView(tabbedPanePrincipal));
      tabbedPanePrincipal.revalidate();
      tabbedPanePrincipal.repaint();
    }//GEN-LAST:event_menuItemConsultaVisitanteActionPerformed

    private void menuItemConsultaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultaMedicoActionPerformed
         tabbedPanePrincipal.add("Consulta de Medico", new ConsultaDeMedicoView(tabbedPanePrincipal));
      tabbedPanePrincipal.revalidate();
      tabbedPanePrincipal.repaint();
    }//GEN-LAST:event_menuItemConsultaMedicoActionPerformed

    private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSobreActionPerformed
        try{JOptionPane.showMessageDialog(this,"JHospital\n\nVersão 1.0\nCopyright MAguiar", "Sobre", JOptionPane.INFORMATION_MESSAGE);
    Desktop browser = Desktop.getDesktop();
        
            browser.browse(new URI("https://github.com/MAguiarP"));
        }
        catch(IOException err){
        }
        catch(URISyntaxException err){
    }    
    }//GEN-LAST:event_menuItemSobreActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        {
            if (JOptionPane.showConfirmDialog(this,"Deseja mesmo fechar o Sistema?!?"," Confirmação",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
             System.exit(0);
        }

    }//GEN-LAST:event_menuItemSairActionPerformed

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
