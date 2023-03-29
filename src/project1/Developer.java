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

public class Developer {
    private String username ;
    private String password ;
    private String Email;
    private String id ;
    private String project ;
public boolean Check(Developer developer , String username , String Password)
{
      try {
          Connection  Conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement ST = Conn.createStatement();
            String SQL = "SELect username , password , email , id , project from user where job = 'developer';";
            ResultSet RS = ST.executeQuery(SQL);
           while( RS.next()){
            if(RS.getString(1).equals(username) && RS.getString(2).equals(Password))
            {
               developer.setUsername(RS.getString(1));
               
               developer.setPassword(RS.getString(2));
               developer.setEmail(RS.getString(3));
                
               developer.setId(RS.getString(4));
               developer.setProject(RS.getString(5));
               return true ;
            }
           }   
          
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error While Connecting the DataBase or Applying the Query", "DataBase ERROR", JOptionPane.ERROR_MESSAGE);
        }
      return false ;
}
public boolean ResetData(String username , String password , String Email , String id)
{
    try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String Query = "Update user set username = '"+username+"' , password = '"+password+"' ,Email = '"+Email+"' WHERE ID = '"+id+"'";
            Statement St = conn.createStatement();
            St.executeUpdate(Query);
            return true ;
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "Error While Connecting the DataBase or Applying the Query", "DataBase ERROR", JOptionPane.ERROR_MESSAGE);
        }
    return false ;
}
    public void setProject(String project) {
        this.project = project;
    }

    public String getProject() {
        return project;
    }
public boolean UpdateBug(String Bug_ID , String status)
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
    return false ;
}

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    public Developer()
    {
        username = "" ; 
        password = "" ;
        Email= "" ;
         id = "";
         project = "";
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
}
