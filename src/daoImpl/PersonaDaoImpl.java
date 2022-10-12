package daoImpl;

import entidad.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.PersonaDao;

public class PersonaDaoImpl implements PersonaDao{
	
	private static final String insert = "INSERT INTO personas(Dni, Nombre, Apellido) VALUES(?, ?, ?)";
	private static final String delete = "DELETE FROM personas WHERE dniPersona = ?";
	private static final String readall = "SELECT * FROM personas";
	
	public boolean insert(Persona persona) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean Cargo = false;
		
		try {
			statement = conexion.prepareStatement(insert);
			statement.setString(1, persona.getDni());
			statement.setString(2, persona.getNombre());
			statement.setString(3, persona.getApellido());
			
			if(statement.executeUpdate() > 0) {
				conexion.commit();
				Cargo = true;
			}			
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				conexion.rollback();
			}catch(SQLException f) {
				f.printStackTrace();
			}
		}
		return Cargo;
	}
	
	public boolean delete(Persona per_delete) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean Eliminado = false;
		try 
		{
			statement = conexion.prepareStatement(delete);
			statement.setString(1, per_delete.getDni());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				Eliminado = true;
			}
		}catch (SQLException e) {
			e.printStackTrace();
			try {
				conexion.rollback();
			}catch(SQLException f) {
				f.printStackTrace();
			}
		}
		return Eliminado;
	}
	
	public ArrayList<Persona> readAll(){
		PreparedStatement statement;
		ResultSet resultSet; //Guarda el resultado de la query
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Conexion conexion = Conexion.getConexion();
		try {
			statement = conexion.getSQLConexion().prepareStatement(readall);
			resultSet = statement.executeQuery();
			while(resultSet.next()){
				personas.add(getPersona(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return personas;
	}
	
	private Persona getPersona(ResultSet resultSet) throws SQLException{
		String dni = resultSet.getString("dni");
		String nombre = resultSet.getString("nombre");
		String apellido = resultSet.getString("apellido");
		return new Persona(dni, nombre, apellido);
	}

	@Override
	public boolean update(Persona persona_Vieja, Persona persona_nueva) {
		// TODO Auto-generated method stub
		return false;
	}

}
