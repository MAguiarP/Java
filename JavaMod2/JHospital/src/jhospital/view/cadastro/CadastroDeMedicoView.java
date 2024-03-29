/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jhospital.view.cadastro;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import jhospital.controller.MedicoController;

/**
 *
 * @author mathe
 */
public class CadastroDeMedicoView extends javax.swing.JPanel {

     private JTabbedPane tabbedPane;
     
    public CadastroDeMedicoView(JTabbedPane tabbedPanel) {
        this.tabbedPane = tabbedPanel;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldEndereco = new javax.swing.JTextField();
        textFieldNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        textFieldTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldEspecialidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textFieldValorDaHora = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textFieldHorasMensais = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cadastro de Médico");

        jLabel2.setText("Nome Completo :");

        jLabel3.setText("Endereço :");

        jLabel7.setText("Telefone :");

        jLabel4.setText("Email :");

        jLabel5.setText("Especialidade :");

        jLabel6.setText("Valor da Hora :");

        jLabel8.setText("Horas Mensais :");

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldTelefone))
                            .addComponent(textFieldNome)
                            .addComponent(textFieldEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textFieldEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldHorasMensais)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 56, Short.MAX_VALUE)
                                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldValorDaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(textFieldHorasMensais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(textFieldValorDaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Deseja mesmo fechar o cadastro de Médico sem salvar?"," Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
       tabbedPane.remove(this);
       tabbedPane.validate();
       tabbedPane.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed
    }
    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
          if (textFieldNome != null && ! textFieldNome.getText().equals("") &&  
           textFieldEmail != null && !textFieldEmail.getText().equals("") && 
           textFieldEndereco != null && !textFieldEndereco.getText().equals("") && 
           textFieldTelefone != null && !textFieldTelefone.getText().equals("") && 
           textFieldEspecialidade != null && !textFieldEspecialidade.getText().equals("") && 
           textFieldValorDaHora != null && !textFieldValorDaHora.getText().equals("") && 
           textFieldHorasMensais != null && !textFieldHorasMensais.getText().equals("")   
           )
          {
            MedicoController mc = new MedicoController();
            try{
                mc.inserir(textFieldNome.getText().toUpperCase(),
                           textFieldEndereco.getText().toUpperCase(),
                           textFieldEmail.getText().toLowerCase(),
                           textFieldTelefone.getText(),
                           textFieldEspecialidade.getText(),
                           textFieldHorasMensais.getText(),
                           textFieldValorDaHora.getText()
                           );
                        JOptionPane.showMessageDialog(this," Contato salvo com sucesso!", " Sucesso", JOptionPane.INFORMATION_MESSAGE );
                    limparDados();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this," Não foi possível salvar contato\n" + e.getLocalizedMessage()," Erro", JOptionPane.ERROR_MESSAGE );
            }
        } else{
            JOptionPane.showMessageDialog(this," Todos os campos do " + " Médico são campos Obrigatórios!", " Erro", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_buttonSalvarActionPerformed
    
        private void limparDados(){
           textFieldNome.setText("");
           textFieldEmail.setText("");
           textFieldEndereco.setText("");
           textFieldTelefone.setText("");
           textFieldEspecialidade.setText("");
           textFieldHorasMensais.setText("");
           textFieldValorDaHora.setText("");
         
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldEspecialidade;
    private javax.swing.JTextField textFieldHorasMensais;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldTelefone;
    private javax.swing.JTextField textFieldValorDaHora;
    // End of variables declaration//GEN-END:variables
}
