package pekan8_2511531012;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class TugassOperatorAssignment_2511531012 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugassOperatorAssignment_2511531012 frame = new TugassOperatorAssignment_2511531012();
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
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "kesalahan",JOptionPane.ERROR_MESSAGE);
	}
	public TugassOperatorAssignment_2511531012() {
		setRootPaneCheckingEnabled(false);
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(28, 41, 79, 22);
		lblNewLabel_1.setAutoscrolls(true);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Operasi Assigment");
		lblNewLabel.setBounds(153, 11, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setBounds(28, 87, 79, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setBounds(28, 134, 79, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setBounds(28, 184, 71, 22);
		contentPane.add(lblNewLabel_4);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(100, 42, 96, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(100, 88, 96, 20);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setBounds(100, 184, 96, 22);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		cbOperator.setToolTipText("");
		cbOperator.setLightWeightPopupEnabled(false);
		cbOperator.setBounds(100, 134, 43, 22);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) { 
					pesanPeringatan ("Bilangan 1 harus diisi");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Bilangan 2 harus diisi");
				}
				else
				{
					try {
						int a= Integer.parseInt(txtBil1.getText());
						int b= Integer.parseInt(txtBil2.getText());
						int c= cbOperator.getSelectedIndex();
						if (c==0) { a += b;}
						if (c==1) { a -= b;}
						if (c==2) { a *= b;}
						if (c==3) { 
							if (b == 0) {
		                        pesanEror("Pembagian tidak bisa dilakukan oleh nol!");
		                        return;
		                    } a /= b;}
						if (c==4) { 
							if (b == 0) {
		                        pesanEror("Modulus tidak bisa dilakukan oleh nol!");
		                        return;
		                    }a %= b;}
						
						txtHasil.setText(String.valueOf(a));
					} catch (NumberFormatException ex) {
						pesanEror("Bilangan 1 dan Bilangan 2 harus angka");
					}
				}
				
			}
		});
		btnNewButton.setBounds(153, 134, 88, 22);
		contentPane.add(btnNewButton);

	}
}
