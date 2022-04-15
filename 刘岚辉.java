package 经典增删查改;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

   private int flag;
   public Login() {
       initComponents();
   }
   
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       jLabel1 = new javax.swing.JLabel();
       jLabel2 = new javax.swing.JLabel();
       jTextField2 = new javax.swing.JTextField();
       jPasswordField1 = new javax.swing.JPasswordField();
       jButton2 = new javax.swing.JButton();
       jButton3 = new javax.swing.JButton();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       jLabel1.setText("账号");
       jLabel2.setText("密码");
       jTextField2.setText(" ");

       jButton2.setText("登录");
       jButton2.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
           }
       });

       jButton3.setText("退出");
       jButton3.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(103, 103, 103)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   .addComponent(jLabel2)
                   .addComponent(jLabel1))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(jButton2)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                       .addComponent(jButton3))
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                       .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                       .addComponent(jPasswordField1)))
               .addContainerGap(114, Short.MAX_VALUE))
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(69, 69, 69)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel1)
                   .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(18, 18, 18)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jButton2)
                   .addComponent(jButton3))
               .addContainerGap(49, Short.MAX_VALUE))
       );
       pack();
   }// </editor-fold>                        

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       System.exit(0);
   }                                        

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       try {
           Connection con = DBConnection.getConnection();
           Statement stmt = con.createStatement();
           String sql="select *from user";
           ResultSet rs = stmt.executeQuery(sql);
           String usename=jTextField2.getText().trim();
           char[] p=jPasswordField1.getPassword();
           String pwd=new String(p);
           String   name = null;
           String pass = null;
           while(rs.next()){
                name=rs.getString(1);
                pass=rs.getString(2);
                if(usename.equals(name)&&pwd.equals(pass)){
                    System.out.println("登录成功！！");

                    new doctorInfoGui().setVisible(true);
                    this.dispose();
             }    
                } 

       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
   }                                        

   public static void main(String args[]) {

       try {
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       //</editor-fold>

       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new Login().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPasswordField jPasswordField1;
   private javax.swing.JTextField jTextField2;
   // End of variables declaration                   
}
