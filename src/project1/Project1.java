/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import javax.swing.* ;
import java.sql.*;

public class Project1 {
public static final String URL = "jdbc:mysql://localhost:3306/database";
public static final String USER = "root";
public static final String PASSWORD = "DoYouBleed?";

    public static void main(String[] args) {
        boolean open = true ;
        Connection Conn = null ;
         home splash = new  home();
         menu Start=new menu();
        splash.setVisible(true);
        try {
            Conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(Start, "Can't Conncect To DataBase", "ERROR", JOptionPane.ERROR_MESSAGE);
            open = false ;
           
        }
        if(!open)
        {
            System.exit(0);
        }
        else{
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                splash.loadingnum.setText(Integer.toString(i)+"%");
                splash.loadingbar.setValue(i);
                if(i==100)
                {
                    splash.setVisible(false);
                    Start.setVisible(true);
                }
            }
        }
        catch(InterruptedException e)
        {
            JOptionPane.showMessageDialog(Start, "Can't Load  The Program", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    }
    
   
}
