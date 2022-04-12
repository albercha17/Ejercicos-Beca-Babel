package Integracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Usuario;

public class DAOUsuario{
	
	private Connection conexion; 
	
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean abrirConexion() throws ClassNotFoundException{
		
		
		String url = "jdbc:mysql://localhost:3306/ejercicio21";
		String usuario = "root";
		String password = "";
		try {
			conexion = DriverManager.getConnection(url,usuario,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean cerrarConexion(){
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean altaUsuario(Usuario c) throws ClassNotFoundException {
		if(!abrirConexion()){
			return false;
		}
		boolean alta = true;
		
		String query = "insert into usuarios (CORREO, PASSWORD) "
				+ " values(?,?)";
		try {
			
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, c.getCorreo());
			ps.setString(2, c.getPassword());
			int numeroFilasAfectadas = ps.executeUpdate();
			if(numeroFilasAfectadas == 0)
				alta = false;
		} catch (SQLException e) {
			alta = false;
			e.printStackTrace();
		} finally{
			cerrarConexion();
		}
		
		return alta;
		
	}

	public boolean eliminarUsuario(String correo) throws ClassNotFoundException {
		if(!abrirConexion()){
			return false;
		}
		
		boolean borrado = true;
		String query = "delete from usuarios where correo = ?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			
			ps.setString(1, correo);
			
			int numeroFilasAfectadas = ps.executeUpdate();
			if(numeroFilasAfectadas == 0)
				borrado = false;
		} catch (SQLException e) {
			borrado = false;
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		return borrado;
		
	}

	public boolean modificarUsuario(Usuario c) throws ClassNotFoundException {
		if(!abrirConexion()){
			return false;
		}
		boolean modificado = true;
		String query = "update usuarios set CORREO=?, PASSWORD=?"
				+ " WHERE ID=?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, c.getCorreo());
			ps.setString(2, c.getPassword());
			ps.setInt(5, c.getId());
			
			int numeroFilasAfectadas = ps.executeUpdate();
			if(numeroFilasAfectadas == 0)
				modificado = false;
		} catch (SQLException e) {
			modificado = false;
			e.printStackTrace();
		} finally{
			cerrarConexion();
		}
		
		return modificado;
		
	}

	public Usuario buscarPorCorreo(String correo) throws ClassNotFoundException {
		if(!abrirConexion()){
			return null;
		}		
		Usuario usuario = null;
		
		String query = "select ID,CORREO,PASSWORD from usuarios "
				+ "where CORREO = ?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, correo);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				usuario = new Usuario(rs.getString(2),rs.getString(3));
				usuario.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		
		
		return usuario;
	}

}
