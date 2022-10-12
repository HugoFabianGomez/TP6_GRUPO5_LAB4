package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		private JMenuItem JMIAgregar, JMIModificar, JMIEliminar, JMIListar;
		private JMenu Personas;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		
		Personas = new JMenu("Personas");
		Personas.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(Personas);
		
		JMIAgregar = new JMenuItem("Agregar");
		JMIAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		JMIAgregar.setHorizontalAlignment(SwingConstants.CENTER);
		Personas.add(JMIAgregar);
		
		JMIModificar = new JMenuItem("Modificar");
		JMIModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JMIModificar.setHorizontalAlignment(SwingConstants.CENTER);
		Personas.add(JMIModificar);
		
		JMIEliminar = new JMenuItem("Eliminar");
		JMIEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JMIEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		Personas.add(JMIEliminar);
		
		JMIListar = new JMenuItem("Listar");
		JMIListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JMIListar.setHorizontalAlignment(SwingConstants.CENTER);
		Personas.add(JMIListar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
}
