/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oradi.inventory.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author olive
 */
public class db {
    public static Connection mycon() throws Exception{
      Connection con=null;
      
      try{
          
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/store","root","");
          return con;
          
      }catch (Exception e){
          System.out.println(e);
          return null;
          
      }
      
    }
}
