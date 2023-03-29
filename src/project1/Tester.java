
package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static project1.Project1.PASSWORD;
import static project1.Project1.URL;
import static project1.Project1.USER;

public class Tester {
    private String username ;
    private String password ;
    private String Email;
    private String id ;
    private String project ;
    
    public Tester()
    {
         username = "" ; 
        password = "" ;
        Email= "" ;
         id = "";
         project = "";
        
    }
public boolean Check(Tester tester , String username , String Password)
{
      try {
          Connection  Conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement ST = Conn.createStatement();
            String SQL = "SELect username , password , email , id , project from user where job = 'tester';";
            ResultSet RS = ST.executeQuery(SQL);
           while( RS.next()){
            if(RS.getString(1).equals(username) && RS.getString(2).equals(Password))
            {
               tester.setUsername(RS.getString(1));
               
               tester.setPassword(RS.getString(2));
               tester.setEmail(RS.getString(3));
                
               tester.setId(RS.getString(4));
               tester.setProject(RS.getString(5));
               return true ;
            }
           }   
          
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error While Connecting the DataBase or Applying the Query", "DataBase ERROR", JOptionPane.ERROR_MESSAGE);
        }
      return false ;
}
public boolean CreateBug(String name , String id , String project)
{
    try {
            Connection Conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String Query = "INSERT INTO `database`.bug (BugID, name, project, Status)" +
	"VALUES ('"+id+"', '"+name+"', '"+project+"', 'Not Done');";
            Statement St = Conn.createStatement();
            St.executeUpdate(Query);
            return true ;
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error While Connecting the DataBase or Applying the Query", "DataBase ERROR", JOptionPane.ERROR_MESSAGE);

        }
    return false ;
}
public boolean UpdateBug(String status , String Bug_ID)
{
     try {
            Connection C = DriverManager.getConnection(URL, USER, PASSWORD);
            String Q = "update bug set status = '"+status+"' where BugID = '"+Bug_ID+"';";
            Statement St = C.createStatement();
            St.executeUpdate(Q);

            return true ;
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Error While Connecting the DataBase or Applying the Query", "DataBase ERROR", JOptionPane.ERROR_MESSAGE);

        }
     
     return false;
}
public boolean AssignBug(String DEVName , String BUGName)
{
    try {
            String Query ="UPDATE bug set devname = '"+DEVName+"' WHERE name = '"+BUGName+"'";
            Connection Conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement St = Conn.createStatement();
            St.executeUpdate(Query);
            return true ;
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error While Connecting the DataBase or Applying the Query", "DataBase ERROR", JOptionPane.ERROR_MESSAGE);

        }
    return false ;
}
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return Email;
    }

    public String getId() {
        return id;
    }

    public String getProject() {
        return project;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProject(String project) {
        this.project = project;
    }
    
    
}
