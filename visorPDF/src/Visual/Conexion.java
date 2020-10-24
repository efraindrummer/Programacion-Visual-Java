/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HERMANOS
 */
public class Conexion {
    Connection conexion = null;
    String mensaje="";
    public Conexion(){
        try{
        Class.forName("org.gjt.mm.mysql.Driver");
        String usuario = "EncuestaProyecto";
        String password = "12345";
        String base = "encuesta";
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/"+base, usuario, password);
        mensaje = "BD " + base + " conectada";
        }catch(ClassNotFoundException ex){
            mensaje = "Error en el driver..";
        }catch(SQLException sqle){
            mensaje = "Error en la conexion..";
        }
    }
    
    public String getMensaje(){
        return mensaje;
    }
    public DefaultTableModel muestraTabla(){
        DefaultTableModel tablamodelo;
        
        tablamodelo = new DefaultTableModel(null, new Object[] {"id_matricula", "nombre", "programa_educativo"});
        PreparedStatement consulta;
        try{
            
            consulta = conexion.prepareStatement("SELECT * FROM usuario");
            ResultSet leeLineas = consulta.executeQuery();
            
        while(leeLineas.next()){
            tablamodelo.addRow(new Object[] {leeLineas.getInt("id_matricula"), leeLineas.getString("nombre"),leeLineas.getString("programa_educativo")});
        }
        consulta.close();
        }catch(SQLException sqlEx){
            mensaje = "error en la consulta";
        }
        return tablamodelo;
    }
    public void insertar(int id_matricula, String nombre, String programa_educativo){
    String sql;
        sql="INSERT INTO usuario (id_matricula,nombre,programa_educativo) VALUES (?,?,?)";
        try {
            PreparedStatement pst =conexion.prepareCall(sql);//conexión  para la base de datos.
            pst.setInt(1, id_matricula);
            pst.setString(2, nombre);
            pst.setString(3, programa_educativo);
          
            pst.executeUpdate();
            mensaje="Registro insertado...";
        } catch (SQLException ex) {
            mensaje = "Error en la insercion...";
        }
    }
    
    public DefaultComboBoxModel llenar(){
    DefaultComboBoxModel mdcmb = new DefaultComboBoxModel();
    PreparedStatement consulta;
        try{
        consulta = conexion.prepareStatement("SELECT * FROM usuario");
        ResultSet leeLineas = consulta.executeQuery();
        while(leeLineas.next()){
            mdcmb.addElement(leeLineas.getInt("id_matricula"));
        }
        consulta.close();
        }catch(SQLException sqlEx){
            mensaje = "error en la consulta";
        }
    return mdcmb;
    }//fin de llenar()
    
    public void eliminar(int id_matricula){
        String sql;
        
        sql="DELETE FROM usuario WHERE id_matricula = ?";
        try{
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, id_matricula);
            pst.executeUpdate();
            mensaje="Registro eliminado";
        } catch (SQLException ex){
            mensaje="Eror en la eliminacion";
        }
    }

    void insertar(String id_matricula, String nombre, String programa_educativo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
