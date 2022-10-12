package negocio;

import entidad.Persona;
import java.util.List;

public interface PersonaNegocio {
	
	public boolean insert(Persona persona);
	public boolean delete(Persona persona_a_eliminar);
	public boolean Modificar(Persona persona, Persona persona_nueva);
	public List<Persona> readAll();

}
