package project1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static project1.Project1.PASSWORD;
import static project1.Project1.URL;
import static project1.Project1.USER;
 

public class ADMIN {
    private String UserName ;
    private String Password ;
    private Connection Conn ;
    
    public ADMIN()
    {
        UserName = "" ; 
        Password = "";
        Conn = null ;
    }
  /*  public Connection getConnection()
    {
        try {
            Conn = (Connection) DriverManager.getConnection(URL, USER, "null");
            return Conn ;
        } catch (Exception e) {
            return null ;
        }
        
    }*/
    public boolean check(String username , String password)
    { 
        try {
            Conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement ST = Conn.createStatement();
            String SQL = "SELECT * FROM `admin`" ;
            ResultSet RS = ST.executeQuery(SQL);
            RS.next();
            UserName = RS.getString(1);
            Password = RS.getString(2);          
            
        } catch (SQLException e) {
            return false ;
        }
        return UserName.equals(username)  && Password.equals(password);
        
       
    }
    
    public boolean CreateUser(String name , String password , String Email , String Job , String ID)
    {
        try {
             Conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
             String insert = "INSERT INTO `database`.user (id, username, password, Email, `permission` , job)" +
              "VALUES ('"+ID+"', '"+name+"', '"+Email+"', '"+password+"','Allowed', '"+Job+"')";
              Statement St = Conn.createStatement();
               St.executeUpdate(insert);
               return  true ;
        } catch (SQLException e) {
            return false ;
        }
    }
    public boolean UpdatePermission(String permission , String id)
    {
        try {
            Connection C = DriverManager.getConnection(URL, USER, PASSWORD);
             String Q = "update user set permission = '"+permission+"' where id = '"+id+"'";
            Statement St = C.createStatement();
            St.executeUpdate(Q);
            return true ;
        } catch (SQLException e) {
            return false ;
        }
    }
    public boolean CreateProject(String id , String projectName)
    {
        try {
            Connection C = DriverManager.getConnection(URL, USER, PASSWORD);
             String Q = "UPDATE user set project = '"+projectName+"' where id = '"+id+"'";
            Statement St = C.createStatement();
            St.executeUpdate(Q);
            return true ;
        } catch (SQLException e) {
            return false ;
        }
    }
    public boolean CreateBug(String bug , String ID , String project, String TesterName)
    {
        
        try {
            String Query = "INSERT INTO `database`.bug (BugID, name ,status, project,devname) \n" +
"	VALUES ('"+ID+"','"+bug+"' ,'not done', '"+project+"' ,'"+TesterName+"');";
           
            Connection Con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement st = Con.createStatement();
            st.executeUpdate(Query);
            return true ;
        } catch (SQLException e) {
            return false ;
        }
    }
    public boolean ViewBugwUpdate(JTable Table)
    {
         Connection Conn = null ;
     
        try {
            
           Conn = (Connection) DriverManager.getConnection(URL, USER,PASSWORD);
            Statement ST = Conn.createStatement();
            ResultSet RS = ST.executeQuery("SELECT * from bug");
            while(Table.getRowCount() > 0)
            {
               ((DefaultTableModel)Table.getModel()).removeRow(0);
            }
            int col = RS.getMetaData().getColumnCount();
            while(RS.next())
            {
                Object [] rows = new Object[col];
                for(int i = 1 ; i<=col ; i++)
                {
                    rows[i-1] = RS.getObject(i);
                }
                ((DefaultTableModel)Table.getModel()).insertRow(RS.getRow() - 1, rows);
            }
         
            RS.close();
            ST.close();
            return true ;
        } catch (SQLException e) {
            return false ;
        }
    }
   
}
