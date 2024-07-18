/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joseph
 */
public class Conexion {
    //conexion local
    public static Connection Conectar()
    {
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ventas", "root", "");
            return cn;
        }catch(SQLException e)
        {
            System.out.println("Error de conexion" + e);
        }
        return null;
    }
}
