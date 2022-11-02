package Ex3;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.ListSelectionModel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Ex3MainApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3MainApp frame = new Ex3MainApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex3MainApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(35, 50, 133, 26);
		contentPane.add(rdbtnWindows);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(35, 87, 133, 26);
		contentPane.add(rdbtnLinux);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(35, 124, 133, 26);
		contentPane.add(rdbtnMac);
		
		ButtonGroup btnGrp = new ButtonGroup();
		
		btnGrp.add(rdbtnMac);
		btnGrp.add(rdbtnLinux);
		btnGrp.add(rdbtnWindows);
		
		
		JLabel lblNewLabel = new JLabel("Selecciona un sistema operativo");
		lblNewLabel.setBounds(35, 11, 192, 28);
		contentPane.add(lblNewLabel);
		
		JCheckBoxMenuItem chckbxProgramacion = new JCheckBoxMenuItem("Programación");
		chckbxProgramacion.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxProgramacion.setBounds(319, 50, 192, 26);
		contentPane.add(chckbxProgramacion);
		
		JLabel lblSeleccionaTusEspecialidades = new JLabel("Selecciona tu/s especialidad/es");
		lblSeleccionaTusEspecialidades.setBounds(319, 11, 192, 28);
		contentPane.add(lblSeleccionaTusEspecialidades);
		
		JCheckBoxMenuItem chckbxDiseoGrfico = new JCheckBoxMenuItem("Diseño gráfico");
		chckbxDiseoGrfico.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxDiseoGrfico.setBounds(319, 87, 192, 26);
		contentPane.add(chckbxDiseoGrfico);
		
		JCheckBoxMenuItem chckbxAdministracin = new JCheckBoxMenuItem("Administración");
		chckbxAdministracin.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxAdministracin.setBounds(319, 124, 192, 26);
		contentPane.add(chckbxAdministracin);
		
		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.setBounds(35, 234, 200, 26);
		contentPane.add(slider);
		
		JLabel lblHorasDedicadasEn = new JLabel("Horas dedicadas en el ordenador (0-10)");
		lblHorasDedicadasEn.setBounds(35, 195, 192, 28);
		contentPane.add(lblHorasDedicadasEn);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(35, 271, 409, 107);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String text = "El sistema operativo elegido es ";
				if (rdbtnWindows.isSelected())
					text+=rdbtnWindows.getText()+"\nTu/s especialidad/es es/son ";
				else if (rdbtnLinux.isSelected())
					text+=rdbtnLinux.getText()+"\nTu/s especialidad/es es/son ";
				else if (rdbtnMac.isSelected())
					text+=rdbtnMac.getText()+"\nTu/s especialidad/es es/son ";
				else
					text+="null\nTu/s especialidad/es es/son ";
					
				if (chckbxAdministracin.isSelected())
					text+="\n"+chckbxAdministracin.getText();
				if (chckbxDiseoGrfico.isSelected())
					text+="\n"+chckbxDiseoGrfico.getText();
				if (chckbxProgramacion.isSelected())
					text+="\n"+chckbxProgramacion.getText();
				text+="\nTus horas dedicadas en el ordenador son "+slider.getValue();
				textArea.setText(text);
			}
		});
		btnNewButton.setBounds(319, 219, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
	}
}
