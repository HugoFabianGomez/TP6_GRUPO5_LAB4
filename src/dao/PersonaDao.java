package dao;

import java.util.ArrayList;

import entidad.Persona;
public interface PersonaDao {

	public boolean insert(Persona persona);
	public boolean delete(Persona per_delete);
	
	ArrayList<Persona> readAll();
	public boolean update(Persona persona_Vieja, Persona persona_nueva);
	
}
