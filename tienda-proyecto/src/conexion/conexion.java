/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
        
public class conexion {
    Connection conectar;
    public conexion (){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_virtual", "root", "");
    }catch (Exception e){
        System.err.println("Sin conexión"+e);}
    }public Connection getConnection(){
        return conectar; }

    public void conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
} 

