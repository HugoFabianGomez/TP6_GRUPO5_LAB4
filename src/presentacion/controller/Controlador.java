package presentacion.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import negocio.PersonaNegocio;
import presentacion.vista.VentanaPrincipal;
import presentacion.vista.PanelAgregar;


public class Controlador implements ActionListener{
	private VentanaPrincipal ventanaPrincipal;
	private PanelAgregar pnlAgregar;
	private PersonaNegocio pNeg;
	
	public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg)
	{
		//Guardo todas las instancias que recibo en el constructor
		this.ventanaPrincipal = vista;
		this.pNeg = pNeg;
		
		//Instancio los paneles
		this.pnlAgregar = new PanelAgregar();
		
		//Eventos menu del Frame principal llamado Ventana
		this.ventanaPrincipal.getJMIAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
		
	}

	public void EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlAgregar);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	
	public void inicializar()
	{
		this.ventanaPrincipal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
