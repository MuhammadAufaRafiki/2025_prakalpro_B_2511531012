package pekan8_2511531012;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511531012 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;

	/**
	 * Launch the application.
	 */
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "kesalahan",JOptionPane.ERROR_MESSAGE);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511531012 frame = new OperatorAritmatikaGUI_2511531012();
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
	public OperatorAritmatikaGUI_2511531012() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 216);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(29, 29, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setBounds(117, 11, 176, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setBounds(29, 54, 59, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setBounds(29, 90, 48, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setBounds(29, 130, 48, 14);
		contentPane.add(lblNewLabel_4);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(96, 26, 96, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(96, 54, 96, 20);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(95, 86, 50, 22);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setBounds(96, 127, 96, 20);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil ;
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
						if (c==0) {hasil = a+b;}
						if (c==1) {hasil = a-b;}
						if (c==2) {hasil = a*b;}
						if (c==3) {hasil = a/b;}
						if (c==4) {hasil = a%b;}
					} catch (NumberFormatException ex) {
						pesanEror("Bilangan 1 dan Bilangan 2 harus angka");
					}
				}
				txtHasil.setText(String.valueOf(hasil));
				
			}
		});
		btnNewButton.setBounds(191, 85, 88, 27);
		contentPane.add(btnNewButton);

	}
}
