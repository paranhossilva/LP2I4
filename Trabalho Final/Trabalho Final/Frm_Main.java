import com.google.gson.Gson;
import javax.swing.JOptionPane;

public class Frm_Main extends javax.swing.JFrame {

    public Frm_Main() {
        initComponents();
    }

    private Conn conn = new Conn();
    private Aluno aluno;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Idade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Peso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Altura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_Objetivo = new javax.swing.JTextArea();
        btn_Incluir = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        btn_Dados = new javax.swing.JButton();
        btn_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho Prártico");
        setName(""); // NOI18N
        setResizable(false);

        jLabel1.setText("Nome:");

        txt_Nome.setToolTipText("");

        jLabel2.setText("Idade:");

        jLabel3.setText("Peso:");

        txt_Peso.setToolTipText("");

        jLabel4.setText("Altura:");

        jLabel5.setText("Objetivo:");

        txa_Objetivo.setColumns(20);
        txa_Objetivo.setRows(5);
        jScrollPane1.setViewportView(txa_Objetivo);

        btn_Incluir.setText("Incluir");
        btn_Incluir.setToolTipText("");
        btn_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IncluirActionPerformed(evt);
            }
        });

        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        btn_Dados.setText("Apresentar Dados");
        btn_Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DadosActionPerformed(evt);
            }
        });

        btn_Sair.setText("Sair");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Nome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_Dados, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Incluir)
                    .addComponent(btn_Limpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Dados)
                    .addComponent(btn_Sair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IncluirActionPerformed
        conn.insere(txt_Nome.getText(), Integer.parseInt(txt_Idade.getText()), Float.parseFloat(txt_Peso.getText()), Float.parseFloat(txt_Altura.getText()), txa_Objetivo.getText());
        
        btn_Limpar.doClick();
    }//GEN-LAST:event_btn_IncluirActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        txt_Nome.setText("");
        txt_Idade.setText("");
        txt_Peso.setText("");
        txt_Altura.setText("");
        txa_Objetivo.setText("");
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DadosActionPerformed
        aluno = new Aluno(txt_Nome.getText(), Integer.parseInt(txt_Idade.getText()), Float.parseFloat(txt_Peso.getText()), Float.parseFloat(txt_Altura.getText()), txa_Objetivo.getText());
        
        Gson gson = new Gson();
        
        String aux = gson.toJson(aluno);
        
        aux = aux.replace("{", "{\n     ");
        aux = aux.replace(",", ",\n     ");
        aux = aux.replace("}", "\n}");
        
        btn_Limpar.doClick();
        
        JOptionPane.showMessageDialog(null,aux, "Dados", JOptionPane.INFORMATION_MESSAGE);   
    }//GEN-LAST:event_btn_DadosActionPerformed

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        System.gc();
        conn.fecha();
        dispose();
    }//GEN-LAST:event_btn_SairActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Dados;
    private javax.swing.JButton btn_Incluir;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txa_Objetivo;
    private javax.swing.JTextField txt_Altura;
    private javax.swing.JTextField txt_Idade;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Peso;
    // End of variables declaration//GEN-END:variables
}
