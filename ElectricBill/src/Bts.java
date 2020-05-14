import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Bts extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtphase;
	private JTextField jtxtunits;
	private JTextField jtxtfc;
	private JTextField jtxtet;
	private JTextField jtxtec;
	private JTextField jtxttotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bts frame = new Bts();
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
	public Bts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textInactiveText);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblElectricBill = new JLabel("ELECTRIC BILL");
		lblElectricBill.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblElectricBill.setBounds(240, 11, 146, 31);
		contentPane.add(lblElectricBill);
		
		JLabel lblPhase = new JLabel("PHASE    :");
		lblPhase.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhase.setBounds(88, 67, 85, 31);
		contentPane.add(lblPhase);
		
		jtxtphase = new JTextField();
		jtxtphase.setBounds(172, 74, 86, 20);
		contentPane.add(jtxtphase);
		jtxtphase.setColumns(10);
		
		JLabel lblUnits = new JLabel("UNITS    :");
		lblUnits.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUnits.setBounds(370, 75, 107, 14);
		contentPane.add(lblUnits);
		
		jtxtunits = new JTextField();
		jtxtunits.setColumns(10);
		jtxtunits.setBounds(455, 74, 86, 20);
		contentPane.add(jtxtunits);
		
		JLabel lblFixedCharge = new JLabel("FIXED CHARGE    :");
		lblFixedCharge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFixedCharge.setBounds(22, 124, 151, 14);
		contentPane.add(lblFixedCharge);
		
		jtxtfc = new JTextField();
		jtxtfc.setBounds(172, 123, 86, 20);
		contentPane.add(jtxtfc);
		jtxtfc.setColumns(10);
		
		JLabel lblEnergyTax = new JLabel("ENERGY TAX  :");
		lblEnergyTax.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnergyTax.setBounds(326, 124, 151, 14);
		contentPane.add(lblEnergyTax);
		
		jtxtet = new JTextField();
		jtxtet.setBounds(455, 123, 86, 20);
		contentPane.add(jtxtet);
		jtxtet.setColumns(10);
		
		JLabel lblEnergyCharge = new JLabel("ENERGY CHARGE:");
		lblEnergyCharge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnergyCharge.setBounds(22, 164, 164, 14);
		contentPane.add(lblEnergyCharge);
		
		jtxtec = new JTextField();
		jtxtec.setBounds(172, 163, 86, 20);
		contentPane.add(jtxtec);
		jtxtec.setColumns(10);
		
		JLabel lblTotal = new JLabel("   TOTAL               :");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTotal.setBounds(22, 220, 151, 14);
		contentPane.add(lblTotal);
		
		jtxttotal = new JTextField();
		jtxttotal.setBounds(172, 220, 86, 20);
		contentPane.add(jtxttotal);
		jtxttotal.setColumns(10);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		lblX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblX.setBounds(648, 0, 20, 31);
		contentPane.add(lblX);
		
		JButton btnClose = new JButton("CLOSE");
			
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnClose.setBounds(240, 278, 107, 31);
		contentPane.add(btnClose);
		setUndecorated(true);
	}
}
