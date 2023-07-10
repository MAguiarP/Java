/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jhospital.view.consulta;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import jhospital.controller.PacienteController;
import jhospital.model.Paciente;

/**
 *
 * @author mathe
 */
public class ConsultaDePacienteView extends javax.swing.JPanel {

     private JTabbedPane tabbedPane;
    
    public ConsultaDePacienteView(JTabbedPane tabbedPanel) {
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

        popupMenu = new javax.swing.JPopupMenu();
        menuItemApagar = new javax.swing.JMenuItem();
        menuItemEditar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        scrollPaneResultados = new javax.swing.JScrollPane();
        tableResultados = new javax.swing.JTable();
        jBConsultar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();

        menuItemApagar.setText("Apagar");
        popupMenu.add(menuItemApagar);

        menuItemEditar.setText("jMenuItem1");
        popupMenu.add(menuItemEditar);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Consulta de Paciente");

        jLabel2.setText("Nome :");

        jLabel3.setText("Email :");

        tableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Endereço", "Email", "Telefone", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableResultadosMouseClicked(evt);
            }
        });
        scrollPaneResultados.setViewportView(tableResultados);
        if (tableResultados.getColumnModel().getColumnCount() > 0) {
            tableResultados.getColumnModel().getColumn(0).setResizable(false);
            tableResultados.getColumnModel().getColumn(1).setResizable(false);
            tableResultados.getColumnModel().getColumn(2).setResizable(false);
            tableResultados.getColumnModel().getColumn(3).setResizable(false);
        }

        jDesktopPane1.setLayer(scrollPaneResultados, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneResultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDesktopPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                    .addComponent(textFieldEmail))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        tabbedPane.remove(this);
        tabbedPane.validate();
        tabbedPane.repaint();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        PacienteController pc = new PacienteController();
        try{
            List<Paciente> ListaDePacientes = pc.buscar(
                    textFieldNome.getText(), textFieldEmail.getText());
            DefaultTableModel model = (DefaultTableModel) 
                    tableResultados.getModel();
      for (int i = model.getRowCount() - 1; i >= 0; i--){
            model.removeRow(i);
       } 
        if (ListaDePacientes != null) {
            for (int i = 0; i< ListaDePacientes.size(); i++) {
                Paciente paciente = ListaDePacientes.get(i);
                String[] p = new String[]{
                    paciente.getNome(),
                    paciente.getEndereco(),
                    paciente.getEmail(),
                    paciente.getTelefone(),
                    String.valueOf(paciente.getNumerodoquarto())};
                model.insertRow(i,p);
            }
        }
        
        tableResultados.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Não foi possível Consultar!\n\n" + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void tableResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableResultadosMouseClicked
       try{
           if (evt.getButton() == MouseEvent.BUTTON3){
               Point p = evt.getPoint();
               int row = tableResultados.rowAtPoint(p);
               
               if(row >= 0 && row < tableResultados.getRowCount()) {
                   
               tableResultados.setRowSelectionInterval(row,row );
               popupMenu.show(evt.getComponent(),evt.getX(),evt.getY());
               }
           }
           } catch (Exception e) {
          JOptionPane.showMessageDialog(this,"Não foi Possível abrir o popup!\n\n" + e.getLocalizedMessage());
       
    }//GEN-LAST:event_tableResultadosMouseClicked
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menuItemApagar;
    private javax.swing.JMenuItem menuItemEditar;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JScrollPane scrollPaneResultados;
    private javax.swing.JTable tableResultados;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables
}
