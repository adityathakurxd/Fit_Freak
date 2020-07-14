/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit_freak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class Fit_Freak {
static Connection con;
Statement st;
ResultSet rs;
public static void main(String args[]){  
try{  
   new Sign_in().setVisible(true);
Class.forName("com.mysql.cj.jdbc.Driver");  
con = DriverManager.getConnection("jdbc:mysql://localhost/actify?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root",""); 
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from logindetails");  
while(rs.next())  
System.out.println(rs.getString(1)+" "+ rs.getString(2));   
}catch(Exception e){ System.out.println(e);}  
}  
}  
