package Ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Ex4MainApp extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldN1;
	private JTextField textFieldN2;
	private JTextField textFieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4MainApp frame = new Ex4MainApp();
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
	public Ex4MainApp() {
		setTitle("MiniCalculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldN1 = new JTextField();
		textFieldN1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldN1.setBounds(10, 116, 117, 46);
		contentPane.add(textFieldN1);
		textFieldN1.setColumns(10);
		
		textFieldN2 = new JTextField();
		textFieldN2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldN2.setColumns(10);
		textFieldN2.setBounds(274, 116, 117, 46);
		contentPane.add(textFieldN2);
		
		
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(428, 125, 24, 28);
		contentPane.add(lblNewLabel);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setEditable(false);
		textFieldResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldResultado.setColumns(10);
		textFieldResultado.setBounds(477, 116, 157, 46);
		contentPane.add(textFieldResultado);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					textFieldResultado.setText(""+(Double.parseDouble(textFieldN1.getText())+Double.parseDouble(textFieldN2.getText())));
				}
				catch (Exception e) {
					textFieldResultado.setText("Valores no válidos");
				}
			}
		});
		btnSuma.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSuma.setBounds(177, 62, 51, 29);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					textFieldResultado.setText(""+(Double.parseDouble(textFieldN1.getText())-Double.parseDouble(textFieldN2.getText())));
				}
				catch (Exception e) {
					textFieldResultado.setText("Valores no válidos");
				}
			}
		});
		btnResta.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnResta.setBounds(177, 102, 51, 29);
		contentPane.add(btnResta);
		
		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					textFieldResultado.setText(""+(Double.parseDouble(textFieldN1.getText())*Double.parseDouble(textFieldN2.getText())));
				}
				catch (Exception e) {
					textFieldResultado.setText("Valores no válidos");
				}
			}
		});
		btnMultiplicacion.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMultiplicacion.setBounds(177, 142, 51, 29);
		contentPane.add(btnMultiplicacion);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if (Double.parseDouble(textFieldN2.getText())==0)
				
					textFieldResultado.setText("Syntax Error");
				else
					textFieldResultado.setText(""+(Double.parseDouble(textFieldN1.getText())/Double.parseDouble(textFieldN2.getText())));
				}
				catch (Exception e) {
					textFieldResultado.setText("Valores no válidos");
				}
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDivision.setBounds(177, 182, 51, 29);
		contentPane.add(btnDivision);
	}
}
