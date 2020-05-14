import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class Display {
	
	private JPanel contentPane;
	private JFrame frame;
	private JTextField jxtunits;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display window = new Display();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Display() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 void initialize() {
		 
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(200, 200, 650, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ELECTRIC BILL");
		lblNewLabel.setBounds(28, 0, 575, 43);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Phase : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(46, 54, 130, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblUnits = new JLabel("UNITS       :");
		lblUnits.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUnits.setBounds(71, 97, 99, 32);
		frame.getContentPane().add(lblUnits);
		
		jxtunits = new JTextField();
		jxtunits.setHorizontalAlignment(SwingConstants.RIGHT);
		jxtunits.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jxtunits.setBounds(180, 99, 98, 24);
		frame.getContentPane().add(jxtunits);
		jxtunits.setColumns(10);
		jxtunits.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(jxtunits);
		
		JComboBox jCBphase = new JComboBox();
		jCBphase.setBorder(new LineBorder(new Color(171, 173, 179)));
		jCBphase.setFont(new Font("Tahoma", Font.BOLD, 18));
		jCBphase.setModel(new DefaultComboBoxModel(new String[] {"Select Phase", "1 Phase", "3 Phase"}));
		jCBphase.setSelectedIndex(0);
		jCBphase.setBounds(180, 54, 153, 32);
		frame.getContentPane().add(jCBphase);
		
		JLabel lblFixedCharge = new JLabel("Fixed Charge :");
		lblFixedCharge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFixedCharge.setBounds(49, 140, 121, 32);
		frame.getContentPane().add(lblFixedCharge);
		
		JLabel lblElectricCharge = new JLabel("Energy  Charge  :");
		lblElectricCharge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblElectricCharge.setBounds(316, 97, 140, 20);
		frame.getContentPane().add(lblElectricCharge);
		
		JLabel lblEnergyTax = new JLabel("Energy Tax      :");
		lblEnergyTax.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnergyTax.setBounds(326, 146, 130, 20);
		frame.getContentPane().add(lblEnergyTax);
		
		JLabel lblTotal = new JLabel("TOTAL          :");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotal.setBounds(55, 200, 121, 32);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblFC = new JLabel("");
		lblFC.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFC.setBackground(Color.DARK_GRAY);
		lblFC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFC.setBounds(180, 141, 98, 31);
		lblFC.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(lblFC);
		
		JLabel lblET = new JLabel("");
		lblET.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblET.setHorizontalAlignment(SwingConstants.RIGHT);
		lblET.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblET.setBackground(Color.DARK_GRAY);
		lblET.setBounds(466, 141, 108, 31);
		frame.getContentPane().add(lblET);
		
		JLabel lblEC = new JLabel("");
		lblEC.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEC.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblEC.setBackground(Color.DARK_GRAY);
		lblEC.setBounds(466, 97, 109, 31);
		frame.getContentPane().add(lblEC);
		
		JLabel labeltotal = new JLabel("");
		labeltotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		labeltotal.setHorizontalAlignment(SwingConstants.RIGHT);
		labeltotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labeltotal.setBackground(Color.YELLOW);
		labeltotal.setBounds(180, 200, 98, 31);
		frame.getContentPane().add(labeltotal);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double fc;
				String fixedc;
				double unit=Double.parseDouble(jxtunits.getText());
				if(jCBphase.getSelectedItem().equals("1 Phase")) {
	//----------------for fixed charge------------------------------------------
					if(0<=unit&&unit<=100) {
						fc=65;
						fixedc=String.format("%.2f", fc );
						lblFC.setText(fixedc);
						}
					if(100<unit&&unit<=500) {
						fc=105;
					    fixedc=String.format("%.2f", fc );
						lblFC.setText(fixedc);
						}}
				else {
					fc=130;
				    fixedc=String.format("%.2f", fc );
					lblFC.setText(fixedc);
				}
//---------------TAX------------------------------------------------------------
			double tax=0.2604*unit;
			String Etax=String.format("%.2f", tax);
			lblET.setText(Etax);
//--------------------Energy charge-----------------------------------------------
			double wheeling=1.48*unit;
			double f1,f2=0,f3=0,f4=0,fac;
			double e1,e2=0,e3=0,e4=0,e,ec;
			if(unit<100) {
				  f1=.17*unit;
				 e1=1.45*unit;
			}
			else
				{ 
				e1=1.45*100;
			    f1=.17*100;
				    if(101<=unit&&unit<=300) {
				    	 e2=3.70*(unit-100);
				    	 f2=.30*(unit-100);
				    }
				    else {
				    	 e2=3.70*200;
				    	 f2=.30*200;
				    	if(301<=unit&&unit<=500) {
				    		f3=.42*(unit-300);
				    		e3=6.31*(unit-300);
				    	}
				    	else {
				    		f3=.42*200;
				    		e3=6.31*200;
				    		f4=.49*(unit-500);
				    		e4=7.71*(unit-500);
				    	}
				    }
				}
			  e=e1+e2+e3+e4;
			  fac=f1+f2+f3+f4;
			  ec=e+fac+wheeling;
			 String Energyc=String.format("%.2f",ec);
					 lblEC.setText(Energyc);
//------------------------energy duty directly added to the total+TOTAL-------------------
			double fcharge=Double.parseDouble(lblFC.getText());
			double echarge=Double.parseDouble(lblEC.getText());
			double etax=Double.parseDouble(lblET.getText());
					 double ed= (16*(fcharge+echarge))/100;
			double total=fcharge+echarge+etax+ed;
			String Ebill=String.format("%.2f", total);
			labeltotal.setText(Ebill);
			
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		
		btnCalculate.setBounds(246, 273, 145, 43);
		frame.getContentPane().add(btnCalculate);
	
	
	}
}
