package 经典增删查改;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
public class doctorInfoGui extends javax.swing.JFrame {
    public doctorInfoGui() {
        initComponents();
        String sql="select*from doctor_info";
        //doctorInfo看作为一个TableModel
        doctorInfo d=new doctorInfo (sql);
        //教你如何添加数据的方法
        jTable1.setModel(d);
        System.out.println(" 已经给表添加好了数据！");
    }

    private void initComponents() {

        jtfseacher = new javax.swing.JTextField();
        jbtseacher = new javax.swing.JButton();
 ///
         //Alt+Enter
       jbtseacher.setMnemonic(KeyEvent.VK_ENTER); 

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfno = new javax.swing.JTextField();
        jtfname = new javax.swing.JTextField();
        jTextFieldks = new javax.swing.JTextField();
        jtflevel = new javax.swing.JTextField();
        jtfghf = new javax.swing.JTextField();
        jbtAdd = new javax.swing.JButton();
        Updatajbt = new javax.swing.JButton();
        jbtUpdata = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        deletejbt = new javax.swing.JButton();
        jbtClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jbtseacher.setText("查询");
        jtfseacher.setToolTipText("按姓名查询");
        jbtseacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtseacherActionPerformed(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        jScrollPane1.setViewportView(jScrollPane2);
        jLabel1.setText("编号");
        jLabel2.setText("姓名");
        jLabel3.setText("科室");
        jLabel4.setText("级别");
        jLabel5.setText("挂号费");
        jtfno.setText(" ");
        jtfname.setText(" ");
        jtflevel.setText(" ");
        jtfghf.setText(" ");

        jbtAdd.setText("添加");
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        Updatajbt.setText("修改");
        Updatajbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatajbtActionPerformed(evt);
            }
        });
        jLabel6.setText("姓名");

        deletejbt.setText("删除");
        deletejbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejbtActionPerformed(evt);
            }
        });

        jbtClear.setText("清空");
        jbtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClearActionPerformed(evt);
            }
        });

        jLabel7.setText("科室");
        jTextFieldks.setText(" ");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jtfseacher, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jbtseacher)
                        .addGap(32, 32, 32)
                        .addComponent(deletejbt))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfno, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtflevel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfghf, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jbtUpdata))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldks, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtAdd)
                                        .addGap(10, 10, 10)
                                        .addComponent(jbtClear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Updatajbt)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2))));

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfseacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtseacher)
                    .addComponent(deletejbt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtUpdata)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jtfno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtflevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfghf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtClear)
                                .addComponent(Updatajbt))
                            .addComponent(jbtAdd, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>                        
    private void jbtseacherActionPerformed(java.awt.event.ActionEvent evt) {                                           
         String text=jtfseacher.getText().trim();
         //重新执行查询sql语句，在读取数据，然后再添加到Table表格中，实现刷新表格的作用
         String sql="select*from doctor_info where name='"+text+"'";
         doctorInfo d=new doctorInfo (sql);
         jTable1.setModel(d);
         jtfseacher.setText("");


    }                                          

    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {                                       
          String no=jtfno.getText().trim();
          String name=jtfname.getText().trim();
          String ks=  jTextFieldks.getText().trim();
          String level=jtflevel.getText().trim();
          String ghf=jtfghf.getText().trim();

          //执行添加sql语句，再读取数据
          String sql = "INSERT INTO doctor_info(no,name ,departments,level,ghf) VALUES('" + no + "','" + name+ "',   '" + ks+ "',   '" + level + "','"+ghf+"')";
          doctorInfo df=new doctorInfo ();
          df.Add(sql);
          //
          //重新读取数据
          String sql1="select*from doctor_info";
          doctorInfo d=new doctorInfo (sql1);
           jTable1.setModel(d);

           jtfno.setText("");
           jtfname.setText("");
           jtflevel.setText("");
           jtfghf.setText("");
           jTextFieldks.setText("");
    }                                      
    private void UpdatajbtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //获取当前位置
        int index = jTable1.getSelectedRow();
        //获取莫一行的第0列的值,注意获取的行数需要减少一个
      String id =  jTable1.getValueAt(index-1, 0).toString() ;

      String no=jtfno.getText().trim();
      String name=jtfname.getText().trim();
      String ks= jTextFieldks.getText().trim();
      String level=jtflevel.getText().trim();
      String ghf=jtfghf.getText().trim();
      jtfno.setText("");
      jtfname.setText("");
      jtflevel.setText("");
      jtfghf.setText("");
      jTextFieldks.setText("");
      String sql = "UPDATE  doctor_info SET name ='" + name + "',departments='" + ks + "',level='" + level+ "',ghf='" + ghf + "' WHERE no='" + no+ "'";
      System.out.println(id);
      System.out.println(no);
      doctorInfo df=new doctorInfo ();
      df.Update(sql);
      //重新读取数据
      String sql1="select*from doctor_info";
      doctorInfo d=new doctorInfo (sql1);
       jTable1.setModel(d);
    }                                         

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
