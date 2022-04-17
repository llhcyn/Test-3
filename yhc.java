package 经典增删查改;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class doctorInfo extends AbstractTableModel  {
       Connection con=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       Vector<Serializable> rowData,columnName;
       public doctorInfo(String sql){
          init( sql) ;
       }

       public doctorInfo(){

        }
       public void init(String sql){

                //columnName保存表头信息
               columnName=new Vector<Serializable>();
               columnName.add("编号");
               columnName.add("姓名");
               columnName.add("科室");
               columnName.add("级别");
               columnName.add("挂号费");

            //rowData向量保存每一行的信息
            rowData=new Vector<Serializable>();
           try {
            con = DBConnection.getConnection();
             ps=(PreparedStatement) con.prepareStatement( sql);
             rs=ps.executeQuery();
            while(rs.next()){
                   Vector bang=new Vector();
                   bang.add(rs.getString(1) );
                   bang.add(rs.getString(2) );
                   bang.add(rs.getString(3) );
                   bang.add(rs.getString(4) );
                   bang.add(rs.getString(5) );

                   //将读取的每一行数据添加到bang中，然后再把bang添加到rowData向量中
                    rowData.add(bang);
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(con!=null&&ps!=null&rs!=null){
                try {
                    con.close();
                    ps.close();
                    rs.close();
                } catch (SQLException e) {

                    e.printStackTrace();
                }

            }
        }
  }
    public void chushihua(String sql){
         Connection con=null;
         PreparedStatement ps=null;
        int rs;

        try {
            con = DBConnection.getConnection();
             ps=(PreparedStatement) con.prepareStatement( sql);
             rs=ps.executeUpdate();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   

    public void delete(String sql){
        chushihua( sql);

    }
    public void Add(String sql){
        chushihua( sql);

    }

    public void Update(String sql){
        chushihua( sql);

    }

   @Override
   public int getRowCount() {
        return this.rowData.size();
   }

   @Override
   public int getColumnCount() {
      return this.columnName.size();
   }

   @Override
   public Object getValueAt(int  row, int column) {
        return  ((Vector ) this.rowData.get(row)).get(column);
   }
   public String getColumnName(int column) {

        return   (String) this.columnName.get(column);
    }
  }