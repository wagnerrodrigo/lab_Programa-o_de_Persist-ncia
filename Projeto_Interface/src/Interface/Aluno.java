/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DAO.AlunosDao;
import Dominio.Alunos;
import javax.swing.JOptionPane;

/**
 *
 * @author alunoces
 */
public class Aluno extends javax.swing.JDialog {
    AlunosDao dao;
    /**
     * Creates new form Aluno
     */
    public Aluno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        lbObs = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbMatricula1 = new javax.swing.JLabel();
        lbNome1 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtMatricula2 = new javax.swing.JTextField();
        lbCelular1 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lbCpf1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btNovo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Aluno");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbObs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbObs.setForeground(new java.awt.Color(0, 204, 153));
        lbObs.setText("OBS:");
        getContentPane().add(lbObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 50, 20));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 100, 280, 30));

        lbMatricula1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbMatricula1.setForeground(new java.awt.Color(0, 204, 153));
        lbMatricula1.setText("Matrícula:");
        getContentPane().add(lbMatricula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 20));

        lbNome1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome1.setForeground(new java.awt.Color(0, 204, 153));
        lbNome1.setText("Nome:");
        getContentPane().add(lbNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 50, 20));

        txtNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 60, 280, 30));

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 204, 153));
        lbEmail.setText("E-mail:");
        getContentPane().add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 50, 20));

        txtMatricula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatricula2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatricula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 20, 70, 30));

        lbCelular1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCelular1.setForeground(new java.awt.Color(0, 204, 153));
        lbCelular1.setText("Celular:");
        getContentPane().add(lbCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 50, 20));

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, 30));

        lbCpf1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCpf1.setForeground(new java.awt.Color(0, 204, 153));
        lbCpf1.setText("CPF:");
        getContentPane().add(lbCpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, 20));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 270, -1));

        btNovo.setText("Novo");
        getContentPane().add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 70, -1));

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 90, -1));

        setSize(new java.awt.Dimension(453, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome1ActionPerformed

    private void txtMatricula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatricula2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatricula2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int status = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair da aplicação?", "Fechar", JOptionPane.YES_NO_OPTION);
        if (status==JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Alunos obj = new Alunos();
            
            obj.setNome(txtNome1.getText());
            obj.setEmail(txtEmail.getText());
            obj.setCelular(Integer.parseInt(txtCelular.getText()));
            obj.setCpf(Integer.parseInt(txtCpf.getText()));
            obj.setObs(jTextArea1.getText());
            
            dao = new AlunosDao();
            dao.cadastrarAluno(obj);
            
            JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso");
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o alunos");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            Alunos obj = new Alunos();
            obj.setMatricula(Integer.parseInt(txtMatricula2.getText()));
            
            dao = new AlunosDao();
            dao.excluirAluno(obj);
            
            JOptionPane.showMessageDialog(null, "dados Excluidos com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao Exclir o produto");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Alunos obj = new Alunos();
            
            obj.setNome(txtNome1.getText());
            obj.setEmail(txtEmail.getText());
            obj.setCelular(Integer.parseInt(txtCelular.getText()));
            obj.setCpf(Integer.parseInt(txtCpf.getText()));
            obj.setObs(jTextArea1.getText());
            
            dao = new AlunosDao();
            dao.alterarAluno(obj);
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o produto");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Aluno dialog = new Aluno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbCelular1;
    private javax.swing.JLabel lbCpf1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbMatricula1;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lbObs;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMatricula2;
    private javax.swing.JTextField txtNome1;
    // End of variables declaration//GEN-END:variables
}
