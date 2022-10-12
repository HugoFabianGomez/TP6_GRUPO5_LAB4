package negocioImpl;

import java.util.List;

import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio {
	
	PersonaDao persDao = new PersonaDaoImpl();

	@Override
	public boolean insert(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Persona persona_a_eliminar) {
		// TODO Auto-generated method stub
		boolean estado = false;
		estado = persDao.delete(persona_a_eliminar);
		return estado;
	}

	@Override
	public boolean Modificar(Persona persona, Persona persona_nueva) {
		// TODO Auto-generated method stub
		return persDao.update(persona, persona_nueva);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
