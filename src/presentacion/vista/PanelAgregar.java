package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelAgregar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre, txtApellido, txtDni;
	private JLabel lblNombre, lblApellido, lblDni;
	private JButton btnAceptar;
	
	public PanelAgregar() {
		setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(121, 35, 69, 20);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(275, 32, 146, 26);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(121, 79, 69, 20);
		add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(275, 74, 145, 26);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		lblDni = new JLabel("Dni");
		lblDni.setBounds(121, 119, 69, 20);
		add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(275, 116, 146, 26);
		add(txtDni);
		txtDni.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(121, 155, 156, 29);
		add(btnAceptar);
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtDni() {
		return txtDni;
	}

	public void setTxtDni(JTextField txtDni) {
		this.txtDni = txtDni;
	}
	
	
}
