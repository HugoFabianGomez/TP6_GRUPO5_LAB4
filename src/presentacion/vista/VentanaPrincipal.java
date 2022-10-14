package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenuItem JMIAgregar, JMIModificar, JMIEliminar, JMIListar;
	private JMenu Personas;
	

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		
		Personas = new JMenu("Personas");
		Personas.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(Personas);
		
		JMIAgregar = new JMenuItem("Agregar");
		JMIAgregar.setHorizontalAlignment(SwingConstants.CENTER);
		Personas.add(JMIAgregar);
		
		JMIModificar = new JMenuItem("Modificar");
		JMIModificar.setHorizontalAlignment(SwingConstants.CENTER);
		Personas.add(JMIModificar);
		
		JMIEliminar = new JMenuItem("Eliminar");
		JMIEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		Personas.add(JMIEliminar);
		
		JMIListar = new JMenuItem("Listar");
		JMIListar.setHorizontalAlignment(SwingConstants.CENTER);
		Personas.add(JMIListar);
	}


	public JMenu getPersonas() {
		return Personas;
	}


	public void setPersonas(JMenu personas) {
		Personas = personas;
	}


	public JMenuItem getJMIAgregar() {
		return JMIAgregar;
	}


	public void setJMIAgregar(JMenuItem jMIAgregar) {
		JMIAgregar = jMIAgregar;
	}


	public JMenuItem getJMIModificar() {
		return JMIModificar;
	}


	public void setJMIModificar(JMenuItem jMIModificar) {
		JMIModificar = jMIModificar;
	}


	public JMenuItem getJMIEliminar() {
		return JMIEliminar;
	}


	public void setJMIEliminar(JMenuItem jMIEliminar) {
		JMIEliminar = jMIEliminar;
	}


	public JMenuItem getJMIListar() {
		return JMIListar;
	}


	public void setJMIListar(JMenuItem jMIListar) {
		JMIListar = jMIListar;
	}
	
}
