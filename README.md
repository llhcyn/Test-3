
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        //获取某一行的具体值，并把它显示在文本框中
        String no = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String name = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String ks = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String level = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String ghf= jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        //把点击的内容显示在文本框中
        jtfno.setText(no);
        jtfname.setText(name);
        jTextFieldks.setText(ks);
        jtflevel.setText(level);
        jtfghf.setText(ghf);
    }                                    

    private void deletejbtActionPerformed(java.awt.event.ActionEvent evt) {                                          
         //设置选择对话框的选项                                     
        String[] options = {"是", "否"};
        int answ = JOptionPane.showOptionDialog(null, "是否确认删除??", "提示", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            int index = jTable1.getSelectedRow();
            String id = jTable1.getValueAt(index, 0).toString();
            String sql="delete from doctor_info where no='"+id+"'";

           // 删除一条记录
            doctorInfo df=new doctorInfo ();
            df.delete(sql);
            System.out.println("删除成功！！！");

            //重新读取数据
            String sql1="select*from doctor_info";
            doctorInfo d=new doctorInfo (sql1);
             jTable1.setModel(d);

             jtfno.setText("");
             jtfname.setText("");
             jtflevel.setText("");
             jtfghf.setText("");
             jTextFieldks.setText("");

            } else 
            {
                JOptionPane.showMessageDialog(null, "无法删除！！！");
            }
    }                                         


    private void jbtClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
         jtfno.setText("");
         jtfname.setText("");
         jtflevel.setText("");
         jtfghf.setText("");
         jTextFieldks.setText("");
    }                                        

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
            java.util.logging.Logger.getLogger(doctorInfoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctorInfoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctorInfoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctorInfoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctorInfoGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Updatajbt;
    private javax.swing.JButton deletejbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;

    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtClear;
    private javax.swing.JButton jbtUpdata;
    private javax.swing.JButton jbtseacher;
    private javax.swing.JTextField jtfghf;
    private javax.swing.JTextField jTextFieldks;
    private javax.swing.JTextField jtflevel;
    private javax.swing.JTextField jtfname;
    private javax.swing.JTextField jtfno;
    private javax.swing.JTextField jtfseacher;
    // End of variables declaration                   
}
