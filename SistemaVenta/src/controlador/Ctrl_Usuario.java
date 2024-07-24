/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Joseph
 */
public class Ctrl_Usuario {
    //Controla el inicio de sesion exitoso en la base de datos
    public boolean loginUser(Usuario objeto)
    {
        boolean respuesta = false;
        Connection cn = Conexion.Conectar();
        String sql = "select usuario, password from tb_usuario where usuario = '"+objeto.getNombre()+"' and password = '"+objeto.getPassword()+"'";
        Statement st;
        try{
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                respuesta = true;
            }
        }catch(SQLException e)
        {
            System.out.println("Error al iniciar sesion");
            JOptionPane.showMessageDialog(null, "Error al inciar sesion");
        }
        return respuesta;
    }
}
