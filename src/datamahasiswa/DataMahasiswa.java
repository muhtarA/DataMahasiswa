/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import datamahasiswa.db.ConnectDB;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author muhtar
 */
public class DataMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Connection connection;
    String sql;
    Statement statement;
    ResultSet resultSet;
    DefaultTableModel tabmode;

    public DataMahasiswa() {
        initComponents();
        ConnectDB connectDB = new ConnectDB();
        connectDB.config();
        connection = connectDB.con;
        statement = connectDB.stm;
        dataMhs();
    }

    public void dataMhs() {
        Object[] Baris = {"Nim", "Nama", "Jurusan", "No Telp"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelMhs.setModel(tabmode);

        String sql = "select * from tb_mhs";
        try {
            Statement stat = connection.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String nim = hasil.getString("npm");
                String nama = hasil.getString("nama");
                String jurusan = hasil.getString("jurusan");
                String telp = hasil.getString("telp");
                String[] data = {nim, nama, jurusan, telp};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            System.err.println("error view tabel " + e.getMessage());
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMhs = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        textFieldNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldNoTelp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldNim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxJurusan = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(250, 250, 250));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("<");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 50, 50);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Data Mahasiswa");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 0, 140, 40);

        tabelMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMhs);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 254, 680, 250);

        jLabel3.setText("No Telpon");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 130, 65, 16);
        jPanel1.add(textFieldNama);
        textFieldNama.setBounds(40, 150, 210, 40);

        jLabel4.setText("Jurusan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 60, 60, 16);
        jPanel1.add(textFieldNoTelp);
        textFieldNoTelp.setBounds(330, 150, 210, 40);

        jLabel5.setText("Nim");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 60, 26, 16);
        jPanel1.add(textFieldNim);
        textFieldNim.setBounds(40, 80, 210, 40);

        jLabel6.setText("Nama");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 130, 50, 16);

        comboBoxJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Jurusan -", "Teknik Informatika", "Sistem Informasi", "Teknik Komputer" }));
        jPanel1.add(comboBoxJurusan);
        comboBoxJurusan.setBounds(320, 80, 220, 27);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(40, 200, 75, 29);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(120, 200, 88, 29);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(230, 200, 84, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(673, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    protected void kosong() {
        textFieldNim.setText("");
        textFieldNama.setText("");
        textFieldNoTelp.setText("");
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String sql = "insert into tb_mhs values(?,?,?,?)";
        try {
            PreparedStatement stat = connection.prepareStatement(sql);
            stat.setString(1, textFieldNim.getText());
            stat.setString(2, textFieldNama.getText());
            stat.setString(3, comboBoxJurusan.getSelectedItem().toString());
            stat.setString(4, textFieldNoTelp.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            textFieldNim.requestFocus();
            dataMhs();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan " + e);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void tabelMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMhsMouseClicked
        // TODO add your handling code here:
        int bar = tabelMhs.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        textFieldNim.setText(a);
        textFieldNama.setText(b);
        comboBoxJurusan.setSelectedItem(c);
        textFieldNoTelp.setText(d);
    }//GEN-LAST:event_tabelMhsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        String sql = "update tb_mhs set nama=?, jurusan=?, telp=? where npm='" + textFieldNim.getText() + "'";
        try {
            PreparedStatement stat = connection.prepareStatement(sql);
            stat.setString(1, textFieldNama.getText());
            stat.setString(2, comboBoxJurusan.getSelectedItem().toString());
            stat.setString(3, textFieldNoTelp.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
            kosong();
            textFieldNim.requestFocus();
            dataMhs();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diupdate " + e.getMessage());
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "delete from tb_mhs where npm='" + textFieldNim.getText() + "'";
            try {
                PreparedStatement stat = connection.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                textFieldNim.requestFocus();
                dataMhs();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus " + e);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new DataMahasiswa().setVisible(false);
        new SuperAdminMenu().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataMahasiswa().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMhs;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldNim;
    private javax.swing.JTextField textFieldNoTelp;
    // End of variables declaration//GEN-END:variables
}