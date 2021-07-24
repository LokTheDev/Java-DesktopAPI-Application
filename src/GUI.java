import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
			
		textField = new JTextField();
		textField.setBounds(0, 28, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(0, 0, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(54, 364, 117, 29);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("Phone Number");
		lblNewLabel_2.setBounds(0, 66, 130, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setBounds(0, 94, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Booking Number");
		lblNewLabel_3.setBounds(0, 132, 117, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Day");
		lblNewLabel_4.setBounds(0, 199, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("Monday");
		comboBox_1.addItem("Tuesday");
		comboBox_1.addItem("Wednesday");
		comboBox_1.addItem("Thursday");
		comboBox_1.addItem("Friday");
		comboBox_1.addItem("Saturday");
		comboBox_1.addItem("Sunday");


		comboBox_1.setBounds(0, 221, 130, 27);
		contentPane.add(comboBox_1);
		
		
		JLabel lblNewLabel_5 = new JLabel("Time");
		lblNewLabel_5.setBounds(0, 260, 61, 16);
		contentPane.add(lblNewLabel_5);
				
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(0, 288, 107, 27);
		contentPane.add(comboBox_2);
		comboBox_2.addItem("10:30");		comboBox_2.addItem("11:00");
		comboBox_2.addItem("11:30");		comboBox_2.addItem("12:00");
		comboBox_2.addItem("12:30");		comboBox_2.addItem("13:00");
		comboBox_2.addItem("13:30");		comboBox_2.addItem("14:00");
		comboBox_2.addItem("14:30");		comboBox_2.addItem("15:00");
		comboBox_2.addItem("15:30");		comboBox_2.addItem("16:00");
		comboBox_2.addItem("16:30");		comboBox_2.addItem("17:00");
		comboBox_2.addItem("17:30");
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(0, 160, 107, 26);
		SpinnerModel value = new SpinnerNumberModel(6, 6, 20, 1);
		spinner.setModel(value);
		contentPane.add(spinner);
	
		JCheckBox chckbxNewCheckBox = new JCheckBox("Deposit Accecpted");
		chckbxNewCheckBox.setBounds(0, 339, 235, 23);
		contentPane.add(chckbxNewCheckBox);
		
		btnNewButton.setEnabled(false);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			btnNewButton.setEnabled(!!chckbxNewCheckBox.isSelected());
	        }
	    });
		
		
		BookingInfo bookingDetail = new BookingInfo();
		
		btnNewButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	         //  Get value from user input
	        	int _bookingID = 0;
	            String _name = textField.getText();
	            int _phoneNumber = Integer.parseInt(textField_1.getText());
	            int _bookingNumber =   Integer.parseInt(spinner.getValue().toString());
	            String _day = comboBox_1.getSelectedItem().toString();
	            String _time = comboBox_2.getSelectedItem().toString();

	            bookingDetail.setBooking(_bookingID, _name, _phoneNumber,  _bookingNumber, _day, _time);
	        }
	    });	
	
	
	}
}
