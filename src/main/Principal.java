package main;

//import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// COMO CARGAR UN USUARIO POR CONSOLA FUNCIONA DE MANERA MANUAL
		//AHORA DEBO TRABAJAR CON EL jPANEL
		boolean Cargados =false;
		PersonaDaoImpl usDao = new PersonaDaoImpl();
		
		Persona us = new Persona();
		us.setDni("2");
		us.setApellido("Fernandez");
		us.setNombre("Alberto");
		
		Cargados = usDao.insert(us);
		if(Cargados = true) {
			System.out.println("Se agregó correctamente " +Cargados + " registros");
			System.out.println(us.getNombre()+ " - " +us.getApellido());
		}else {
			System.out.println("No Se agregó algún registro");
		}

	}

}
